package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n36 extends n16 {
    public final /* synthetic */ int b;

    public n36(int i) {
        this.b = i;
        if (i != 1) {
            ArrayList arrayList = this.a;
            arrayList.add(u46.AND);
            arrayList.add(u46.NOT);
            arrayList.add(u46.OR);
        }
    }

    @Override // defpackage.n16
    public final ez5 a(String str, ma5 ma5Var, ArrayList arrayList) {
        switch (this.b) {
            case 0:
                u46 u46Var = u46.ADD;
                int iOrdinal = nw6.e(str).ordinal();
                if (iOrdinal == 1) {
                    nw6.h("AND", 2, arrayList);
                    ez5 ez5VarB = ma5Var.b((ez5) arrayList.get(0));
                    return !ez5VarB.zzg().booleanValue() ? ez5VarB : ma5Var.b((ez5) arrayList.get(1));
                }
                if (iOrdinal == 47) {
                    nw6.h("NOT", 1, arrayList);
                    return new av5(Boolean.valueOf(!ma5Var.b((ez5) arrayList.get(0)).zzg().booleanValue()));
                }
                if (iOrdinal != 50) {
                    b(str);
                    throw null;
                }
                nw6.h("OR", 2, arrayList);
                ez5 ez5VarB2 = ma5Var.b((ez5) arrayList.get(0));
                return ez5VarB2.zzg().booleanValue() ? ez5VarB2 : ma5Var.b((ez5) arrayList.get(1));
            default:
                if (str == null || str.isEmpty() || !ma5Var.j(str)) {
                    throw new IllegalArgumentException(String.format("Command not found: %s", str));
                }
                ez5 ez5VarD = ma5Var.d(str);
                if (ez5VarD instanceof uw5) {
                    return ((uw5) ez5VarD).d(ma5Var, arrayList);
                }
                throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
    }
}
