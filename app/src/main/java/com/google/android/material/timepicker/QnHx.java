package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView w;

    public QnHx(ClockFaceView clockFaceView) {
        this.w = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.w;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.P.x) - clockFaceView.W;
        if (height != clockFaceView.N) {
            clockFaceView.N = height;
            clockFaceView.g();
            int i = clockFaceView.N;
            ClockHandView clockHandView = clockFaceView.P;
            clockHandView.F = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
