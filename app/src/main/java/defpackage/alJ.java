package defpackage;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.FJCM;
import androidx.appcompat.view.menu.YKK;

/* JADX INFO: loaded from: classes.dex */
public abstract class alJ {
    public QnHx a;

    public interface QnHx {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(FJCM fjcm) {
    }

    public boolean g() {
        return false;
    }

    public void h(YKK.QnHx qnHx) {
        if (this.a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.a = qnHx;
    }
}
