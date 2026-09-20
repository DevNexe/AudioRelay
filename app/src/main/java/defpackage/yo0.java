package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class yo0 implements Drawable.Callback {
    public final /* synthetic */ zo0 w;

    public yo0(zo0 zo0Var) {
        this.w = zo0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        zo0 zo0Var = this.w;
        zo0Var.C.setValue(Integer.valueOf(((Number) zo0Var.C.getValue()).intValue() + 1));
        zo0Var.D.setValue(new cm4(ap0.a(zo0Var.B)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        ((Handler) ap0.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        ((Handler) ap0.a.getValue()).removeCallbacks(runnable);
    }
}
