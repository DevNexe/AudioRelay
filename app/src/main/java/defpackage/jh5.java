package defpackage;

import defpackage.z_Mm;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jh5<V extends z_Mm> implements fh5<V> {
    public final Map<Integer, uy2<V, mq0>> a;
    public final int b;
    public V c;
    public V d;

    public jh5(LinkedHashMap linkedHashMap, int i) {
        this.a = linkedHashMap;
        this.b = i;
    }

    @Override // defpackage.bh5
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.bh5
    public final V b(long j, V v, V v2, V v3) {
        long jP = AY.p((j / 1000000) - ((long) 0), 0L, d());
        if (jP <= 0) {
            return v3;
        }
        z_Mm z_mmE = e((jP - 1) * 1000000, v, v2, v3);
        z_Mm z_mmE2 = e(jP * 1000000, v, v2, v3);
        if (this.c == null) {
            this.c = (V) v.c();
            this.d = (V) v.c();
        }
        int iB = z_mmE.b();
        for (int i = 0; i < iB; i++) {
            V v4 = this.d;
            if (v4 == null) {
                ur1.e("velocityVector");
                throw null;
            }
            v4.e((z_mmE.a(i) - z_mmE2.a(i)) * 1000.0f, i);
        }
        V v5 = this.d;
        if (v5 != null) {
            return v5;
        }
        ur1.e("velocityVector");
        throw null;
    }

    @Override // defpackage.fh5
    public final int c() {
        return 0;
    }

    @Override // defpackage.fh5
    public final int d() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bh5
    public final V e(long j, V v, V v2, V v3) {
        int iP = (int) AY.p((j / 1000000) - ((long) 0), 0L, d());
        Integer numValueOf = Integer.valueOf(iP);
        Map<Integer, uy2<V, mq0>> map = this.a;
        if (map.containsKey(numValueOf)) {
            return (V) ((uy2) t92.P(Integer.valueOf(iP), map)).w;
        }
        int i = this.b;
        if (iP >= i) {
            return v2;
        }
        if (iP <= 0) {
            return v;
        }
        mq0 mq0Var = nq0.QnHx.a;
        V v4 = v;
        int i2 = 0;
        for (Map.Entry<Integer, uy2<V, mq0>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            uy2<V, mq0> value = entry.getValue();
            if (iP > iIntValue && iIntValue >= i2) {
                v4 = value.w;
                mq0Var = value.x;
                i2 = iIntValue;
            } else if (iP < iIntValue && iIntValue <= i) {
                v2 = value.w;
                i = iIntValue;
            }
        }
        float fA = mq0Var.a((iP - i2) / (i - i2));
        if (this.c == null) {
            this.c = (V) v.c();
            this.d = (V) v.c();
        }
        int iB = v4.b();
        for (int i3 = 0; i3 < iB; i3++) {
            V v5 = this.c;
            if (v5 == null) {
                ur1.e("valueVector");
                throw null;
            }
            float fA2 = v4.a(i3);
            float fA3 = v2.a(i3);
            qb5 qb5Var = mg5.a;
            v5.e((fA3 * fA) + ((1 - fA) * fA2), i3);
        }
        V v6 = this.c;
        if (v6 != null) {
            return v6;
        }
        ur1.e("valueVector");
        throw null;
    }

    @Override // defpackage.bh5
    public final z_Mm f(z_Mm z_mm, z_Mm z_mm2, z_Mm z_mm3) {
        return b(g(z_mm, z_mm2, z_mm3), z_mm, z_mm2, z_mm3);
    }

    @Override // defpackage.bh5
    public final long g(z_Mm z_mm, z_Mm z_mm2, z_Mm z_mm3) {
        return ((long) (d() + 0)) * 1000000;
    }
}
