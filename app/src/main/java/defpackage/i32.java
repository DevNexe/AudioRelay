package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i32 implements po1, qf6 {
    public static final /* synthetic */ i32 w = new i32();

    @Override // defpackage.po1
    public NUlFixed a() {
        return AY.a(64, lg.DROP_LATEST, 4);
    }

    @Override // defpackage.po1
    public Object b(ro1 ro1Var, mz0 mz0Var, z80 z80Var) {
        Object objE = kd.e(mz0Var, new h32(ro1Var, null), z80Var);
        return objE == va0.COROUTINE_SUSPENDED ? objE : sd5.a;
    }

    @Override // defpackage.po1
    public boolean c() {
        return true;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Double.valueOf(u77.x.zza().zza());
    }
}
