package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d02 implements c02, vb2 {
    public final yz1 w;
    public final bw4 x;
    public final HashMap<Integer, b43[]> y = new HashMap<>();

    public d02(yz1 yz1Var, bw4 bw4Var) {
        this.w = yz1Var;
        this.x = bw4Var;
    }

    @Override // defpackage.vb2
    public final sb2 K(int i, int i2, Map<IlK, Integer> map, j81<? super b43.QnHx, sd5> j81Var) {
        return this.x.K(i, i2, map, j81Var);
    }

    @Override // defpackage.c02
    public final b43[] P(int i, long j) {
        HashMap<Integer, b43[]> map = this.y;
        b43[] b43VarArr = map.get(Integer.valueOf(i));
        if (b43VarArr != null) {
            return b43VarArr;
        }
        yz1 yz1Var = this.w;
        Object objA = yz1Var.b.invoke().a(i);
        List<ob2> listF = this.x.F(objA, yz1Var.a(i, objA));
        int size = listF.size();
        b43[] b43VarArr2 = new b43[size];
        for (int i2 = 0; i2 < size; i2++) {
            b43VarArr2[i2] = listF.get(i2).y(j);
        }
        map.put(Integer.valueOf(i), b43VarArr2);
        return b43VarArr2;
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return this.x.Q(f);
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.x.U();
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return this.x.b0(f);
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.x.getDensity();
    }

    @Override // defpackage.rr1
    public final jy1 getLayoutDirection() {
        return this.x.getLayoutDirection();
    }

    @Override // defpackage.c02, defpackage.ij0
    public final float j(int i) {
        return this.x.j(i);
    }

    @Override // defpackage.ij0
    public final int p0(float f) {
        return this.x.p0(f);
    }

    @Override // defpackage.ij0
    public final long v(long j) {
        return this.x.v(j);
    }

    @Override // defpackage.ij0
    public final long v0(long j) {
        return this.x.v0(j);
    }

    @Override // defpackage.ij0
    public final float x0(long j) {
        return this.x.x0(j);
    }
}
