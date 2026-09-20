package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ch5 implements cAe {
    public final ArrayList a;

    public ch5(float f, float f2, z_Mm z_mm) {
        pp1 pp1VarV = AY.V(0, z_mm.b());
        ArrayList arrayList = new ArrayList(mu.w0(pp1VarV, 10));
        op1 it = pp1VarV.iterator();
        while (it.y) {
            arrayList.add(new bz0(f, f2, z_mm.a(it.nextInt())));
        }
        this.a = arrayList;
    }

    @Override // defpackage.cAe
    public final vy0 get(int i) {
        return (bz0) this.a.get(i);
    }
}
