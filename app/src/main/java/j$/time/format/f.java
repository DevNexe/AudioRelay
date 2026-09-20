package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class f implements g {
    private final g[] a;
    private final boolean b;

    f(ArrayList arrayList, boolean z) {
        this((g[]) arrayList.toArray(new g[arrayList.size()]), z);
    }

    f(g[] gVarArr, boolean z) {
        this.a = gVarArr;
        this.b = z;
    }

    public final f a() {
        return !this.b ? this : new f(this.a, false);
    }

    @Override // j$.time.format.g
    public final boolean j(u uVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            uVar.g();
        }
        try {
            for (g gVar : this.a) {
                if (!gVar.j(uVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                uVar.a();
            }
        }
    }

    @Override // j$.time.format.g
    public final int k(s sVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        g[] gVarArr = this.a;
        if (!z) {
            for (g gVar : gVarArr) {
                i = gVar.k(sVar, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }
        sVar.q();
        int iK = i;
        for (g gVar2 : gVarArr) {
            iK = gVar2.k(sVar, charSequence, iK);
            if (iK < 0) {
                sVar.e(false);
                return i;
            }
        }
        sVar.e(true);
        return iK;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        g[] gVarArr = this.a;
        if (gVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (g gVar : gVarArr) {
                sb.append(gVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
