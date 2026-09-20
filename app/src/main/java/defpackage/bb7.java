package defpackage;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class bb7 extends qb7 {
    public final /* synthetic */ qb7 A;
    public final transient int y;
    public final transient int z;

    public bb7(qb7 qb7Var, int i, int i2) {
        this.A = qb7Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.ea7
    public final int b() {
        return this.A.c() + this.y + this.z;
    }

    @Override // defpackage.ea7
    public final int c() {
        return this.A.c() + this.y;
    }

    @Override // defpackage.ea7
    @CheckForNull
    public final Object[] d() {
        return this.A.d();
    }

    @Override // defpackage.qb7, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final qb7 subList(int i, int i2) {
        Th.Y(i, i2, this.z);
        int i3 = this.y;
        return this.A.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Th.S(i, this.z);
        return this.A.get(i + this.y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }
}
