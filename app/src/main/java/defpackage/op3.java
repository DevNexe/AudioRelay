package defpackage;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class op3 extends wc0 {
    public final int D;
    public final int E;
    public final LayoutInflater F;

    @Deprecated
    public op3(Context context, int i) {
        super(context);
        this.E = i;
        this.D = i;
        this.F = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
