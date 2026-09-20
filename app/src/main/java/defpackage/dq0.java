package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.CQf;

/* JADX INFO: loaded from: classes3.dex */
public final class dq0 implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView w;
    public final /* synthetic */ CQf x;

    public dq0(CQf cQf, AutoCompleteTextView autoCompleteTextView) {
        this.x = cQf;
        this.w = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 1) {
            CQf cQf = this.x;
            cQf.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - cQf.k;
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 300) {
                z = false;
            }
            if (z) {
                cQf.i = false;
            }
            CQf.d(cQf, this.w);
        }
        return false;
    }
}
