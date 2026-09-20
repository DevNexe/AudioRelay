package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class IrX implements ti5 {
    public final ViewConfiguration a;

    public IrX(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.ti5
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.ti5
    public final void b() {
    }

    @Override // defpackage.ti5
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.ti5
    public final long d() {
        float f = 48;
        return fp1.l(f, f);
    }

    @Override // defpackage.ti5
    public final float e() {
        return this.a.getScaledTouchSlop();
    }
}
