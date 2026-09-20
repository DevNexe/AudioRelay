package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt8Fixed extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView w;

    public LPt8Fixed(TimePickerView timePickerView) {
        this.w = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
        int i = TimePickerView.N;
        this.w.getClass();
        return zOnDoubleTap;
    }
}
