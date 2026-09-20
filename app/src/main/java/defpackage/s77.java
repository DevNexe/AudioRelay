package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s77 implements r77 {
    public static final px6 a;

    static {
        tx6 tx6Var = new tx6(lx6.a(), false, true);
        tx6Var.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        tx6Var.c("measurement.lifecycle.app_backgrounded_tracking", true);
        a = tx6Var.c("measurement.lifecycle.app_in_background_parameter", false);
        tx6Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // defpackage.r77
    public final boolean zza() {
        return ((Boolean) a.b()).booleanValue();
    }
}
