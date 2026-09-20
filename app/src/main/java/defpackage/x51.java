package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class x51<E> extends B8C {
    public final Activity w;
    public final Context x;
    public final Handler y;
    public final a61 z;

    public x51(u51 u51Var) {
        Handler handler = new Handler();
        this.z = new a61();
        this.w = u51Var;
        if (u51Var == null) {
            throw new NullPointerException("context == null");
        }
        this.x = u51Var;
        this.y = handler;
    }

    public abstract u51 V0();

    public abstract LayoutInflater W0();

    public abstract void X0();
}
