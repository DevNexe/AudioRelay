package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes3.dex */
public final class u75 implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector w;

    public u75(GestureDetector gestureDetector) {
        this.w = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.w.onTouchEvent(motionEvent);
        }
        return false;
    }
}
