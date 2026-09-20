package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.LPt8Fixed;
import androidx.emoji2.text.YKK;

/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements KeyListener {
    public final KeyListener a;
    public final QnHx b;

    public static class QnHx {
    }

    public kr0(KeyListener keyListener) {
        QnHx qnHx = new QnHx();
        this.a = keyListener;
        this.b = qnHx;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean zA;
        boolean z;
        this.b.getClass();
        Object obj = LPt8Fixed.i;
        if (i != 67) {
            zA = i != 112 ? false : YKK.a(editable, keyEvent, true);
        } else {
            zA = YKK.a(editable, keyEvent, false);
        }
        if (zA) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
