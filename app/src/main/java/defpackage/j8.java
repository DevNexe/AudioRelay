package defpackage;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j8 {
    public final String a;
    public final String b;
    public final String c;
    public final List<h7> d;
    public final List<d7> e;
    public final List<q7> f;
    public final List<r7> g;
    public final boolean h;
    public final boolean i;
    public final s42 j;
    public final s42 k;
    public final List<b7> l;
    public final boolean m;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j8(String str, String str2, String str3, s42 s42Var, s42 s42Var2, boolean z, int i) {
        s42 s42VarQ;
        s42 s42VarQ2;
        String str4 = (i & 4) != 0 ? "" : str3;
        int i2 = i & 8;
        cs0 cs0Var = cs0.w;
        cs0 cs0Var2 = i2 != 0 ? cs0Var : null;
        cs0 cs0Var3 = (i & 16) != 0 ? cs0Var : null;
        cs0 cs0Var4 = (i & 32) != 0 ? cs0Var : null;
        cs0 cs0Var5 = (i & 64) != 0 ? cs0Var : null;
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            s42.QnHx qnHx = s42.Companion;
            s42VarQ = Th.q();
        } else {
            s42VarQ = s42Var;
        }
        if ((i & 1024) != 0) {
            s42.QnHx qnHx2 = s42.Companion;
            s42VarQ2 = Th.q();
        } else {
            s42VarQ2 = s42Var2;
        }
        this(str, str2, str4, cs0Var2, cs0Var3, cs0Var4, cs0Var5, false, false, s42VarQ, s42VarQ2, (i & 2048) != 0 ? cs0Var : null, (i & 4096) != 0 ? false : z);
    }

    public static j8 a(j8 j8Var, String str, List list, List list2, List list3, ArrayList arrayList, boolean z, boolean z2, s42 s42Var, List list4, int i) {
        String str2 = (i & 1) != 0 ? j8Var.a : null;
        String str3 = (i & 2) != 0 ? j8Var.b : null;
        String str4 = (i & 4) != 0 ? j8Var.c : str;
        List list5 = (i & 8) != 0 ? j8Var.d : list;
        List list6 = (i & 16) != 0 ? j8Var.e : list2;
        List list7 = (i & 32) != 0 ? j8Var.f : list3;
        List<r7> list8 = (i & 64) != 0 ? j8Var.g : arrayList;
        boolean z3 = (i & 128) != 0 ? j8Var.h : z;
        boolean z4 = (i & 256) != 0 ? j8Var.i : z2;
        s42 s42Var2 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? j8Var.j : null;
        s42 s42Var3 = (i & 1024) != 0 ? j8Var.k : s42Var;
        List list9 = (i & 2048) != 0 ? j8Var.l : list4;
        boolean z5 = (i & 4096) != 0 ? j8Var.m : false;
        j8Var.getClass();
        return new j8(str2, str3, str4, list5, list6, list7, list8, z3, z4, s42Var2, s42Var3, list9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return ur1.a(this.a, j8Var.a) && ur1.a(this.b, j8Var.b) && ur1.a(this.c, j8Var.c) && ur1.a(this.d, j8Var.d) && ur1.a(this.e, j8Var.e) && ur1.a(this.f, j8Var.f) && ur1.a(this.g, j8Var.g) && this.h == j8Var.h && this.i == j8Var.i && ur1.a(this.j, j8Var.j) && ur1.a(this.k, j8Var.k) && ur1.a(this.l, j8Var.l) && this.m == j8Var.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final int hashCode() {
        int iA = qg5.a(this.g, qg5.a(this.f, qg5.a(this.e, qg5.a(this.d, bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        boolean z = this.h;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iA + r2) * 31;
        boolean z2 = this.i;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iA2 = qg5.a(this.l, (this.k.hashCode() + ((this.j.hashCode() + ((i + r3) * 31)) * 31)) * 31, 31);
        boolean z3 = this.m;
        return iA2 + (z3 ? 1 : z3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BallastViewModelState(connectionId=");
        sb.append(this.a);
        sb.append(", viewModelName=");
        sb.append(this.b);
        sb.append(", viewModelType=");
        sb.append(this.c);
        sb.append(", inputs=");
        sb.append(this.d);
        sb.append(", events=");
        sb.append(this.e);
        sb.append(", sideJobs=");
        sb.append(this.f);
        sb.append(", states=");
        sb.append(this.g);
        sb.append(", viewModelActive=");
        sb.append(this.h);
        sb.append(", eventProcessingActive=");
        sb.append(this.i);
        sb.append(", firstSeen=");
        sb.append(this.j);
        sb.append(", lastSeen=");
        sb.append(this.k);
        sb.append(", fullHistory=");
        sb.append(this.l);
        sb.append(", refreshing=");
        return dj.c(sb, this.m, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j8(String str, String str2, String str3, List<h7> list, List<d7> list2, List<q7> list3, List<r7> list4, boolean z, boolean z2, s42 s42Var, s42 s42Var2, List<? extends b7> list5, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = z;
        this.i = z2;
        this.j = s42Var;
        this.k = s42Var2;
        this.l = list5;
        this.m = z3;
        List<h7> list6 = list;
        int i = 0;
        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
            Iterator<T> it = list6.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (ur1.a(((h7) it.next()).g, h7.QnHx.auxFixed.a) && (i2 = i2 + 1) < 0) {
                    ps0.i0();
                    throw null;
                }
            }
        }
        List<d7> list7 = this.e;
        if (!(list7 instanceof Collection) || !list7.isEmpty()) {
            Iterator<T> it2 = list7.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                if (ur1.a(((d7) it2.next()).f, d7.QnHx.LPt8Fixed.a) && (i3 = i3 + 1) < 0) {
                    ps0.i0();
                    throw null;
                }
            }
        }
        List<q7> list8 = this.f;
        if ((list8 instanceof Collection) && list8.isEmpty()) {
            return;
        }
        Iterator<T> it3 = list8.iterator();
        while (it3.hasNext()) {
            if (ur1.a(((q7) it3.next()).f, q7.QnHx.NUlFixed.a) && (i = i + 1) < 0) {
                ps0.i0();
                throw null;
            }
        }
    }
}
