package defpackage;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class IH$ extends cx1 implements j81<uk, po0> {
    public final /* synthetic */ long w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ np3 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IH$(long j, boolean z, np3 np3Var, boolean z2) {
        super(1);
        this.w = j;
        this.x = z;
        this.y = np3Var;
        this.z = z2;
    }

    @Override // defpackage.j81
    public final po0 invoke(uk ukVar) {
        uk ukVar2 = ukVar;
        bj1 bj1VarD = ukJW.d(ukVar2, cm4.e(ukVar2.d()) / 2.0f);
        int i = Build.VERSION.SDK_INT;
        long j = this.w;
        return ukVar2.c(new cv(this.x, this.y, this.z, bj1VarD, new av(i >= 29 ? bb.a.a(j, 5) : new PorterDuffColorFilter(hH.A(j), fp1.z0(5)))));
    }
}
