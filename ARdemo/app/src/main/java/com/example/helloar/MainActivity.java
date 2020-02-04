package com.example.helloar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.ar.core.Anchor;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.BaseArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

import java.util.function.Consumer;

public class MainActivity extends AppCompatActivity {
    private ArFragment arFragment;
    private ModelRenderable andyRenderable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);

        arFragment.setOnTapArPlaneListener(
                new BaseArFragment.OnTapArPlaneListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public void onTapPlane(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
//                        if (andyRenderable == null) {
//                            return;
//                        }

                        // Create the Anchor.
                        Anchor anchor = hitResult.createAnchor();
//                        AnchorNode anchorNode = new AnchorNode(anchor);
//                        anchorNode.setParent(arFragment.getArSceneView().getScene());
//
//                        // Create the transformable andy and add it to the anchor.
//                        TransformableNode andy = new TransformableNode(arFragment.getTransformationSystem());
//                        andy.setParent(anchorNode);
//                        andy.setRenderable(andyRenderable);
//                        andy.select();

//                        ModelRenderable.builder()
//                                .setSource(this, R.raw.andy)
//                                .build()
//                                .thenAccept(new Consumer<ModelRenderable>() {
//                                    @Override
//                                    public void accept(ModelRenderable renderable) {
//                                        andyRenderable = renderable;
//                                    }
//                                })
//                                .exceptionally(
//                                        throwable -> {
//                                            Toast toast =
//                                                    Toast.makeText(this, "Unable to load andy renderable", Toast.LENGTH_LONG);
//                                            toast.setGravity(Gravity.CENTER, 0, 0);
//                                            toast.show();
//                                            return null;
//                                        });
                    }
                });
    }
}
