package defpackage;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class kva9 extends cx1 implements j81<uk, po0> {
    public final /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kva9(long j) {
        super(1);
        this.w = j;
    }

    @Override // defpackage.j81
    public final po0 invoke(uk ukVar) {
        uk ukVar2 = ukVar;
        float fE = cm4.e(ukVar2.d()) / 2.0f;
        bj1 bj1VarD = ukJW.d(ukVar2, fE);
        int i = Build.VERSION.SDK_INT;
        long j = this.w;
        return ukVar2.c(new ZPh(fE, bj1VarD, new av(i >= 29 ? bb.a.a(j, 5) : new PorterDuffColorFilter(hH.A(j), fp1.z0(5)))));
    }
}
