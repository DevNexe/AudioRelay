package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.PRnFixed;
import androidx.lifecycle.T23;
import androidx.lifecycle.YKK;

/* JADX INFO: loaded from: classes.dex */
public class wy extends Activity implements d32, yv1.QnHx {
    public final T23 w;

    public wy() {
        new ok4();
        this.w = new T23(this);
    }

    public YKK c() {
        return this.w;
    }

    @Override // yv1.QnHx
    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !yv1.a(decorView, keyEvent)) {
            return yv1.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !yv1.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PRnFixed.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        YKK.F1 f1 = YKK.F1.CREATED;
        T23 t23 = this.w;
        t23.e("markState");
        t23.h(f1);
        super.onSaveInstanceState(bundle);
    }
}
