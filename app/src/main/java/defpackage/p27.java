package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p27 extends s27 {
    @Override // defpackage.s27
    public final void a(long j, Object obj) {
        ((d27) e57.j(j, obj)).zzb();
    }

    @Override // defpackage.s27
    public final void b(long j, Object obj, Object obj2) {
        d27 d27VarZzd = (d27) e57.j(j, obj);
        d27 d27Var = (d27) e57.j(j, obj2);
        int size = d27VarZzd.size();
        int size2 = d27Var.size();
        if (size > 0 && size2 > 0) {
            if (!d27VarZzd.zzc()) {
                d27VarZzd = d27VarZzd.zzd(size2 + size);
            }
            d27VarZzd.addAll(d27Var);
        }
        if (size > 0) {
            d27Var = d27VarZzd;
        }
        e57.q(j, obj, d27Var);
    }
}
