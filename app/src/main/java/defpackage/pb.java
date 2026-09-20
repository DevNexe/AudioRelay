package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pb {
    public final Context a;
    public final lKy3 b;
    public final zb c;
    public final kc d;

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public final String a;
            public final boolean b;
            public final boolean c;
            public final boolean d;
            public final boolean e;

            public CQf(String str, boolean z, boolean z2, boolean z3, boolean z4) {
                this.a = str;
                this.b = z;
                this.c = z2;
                this.d = z3;
                this.e = z4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CQf)) {
                    return false;
                }
                CQf cQf = (CQf) obj;
                return ur1.a(this.a, cQf.a) && this.b == cQf.b && this.c == cQf.c && this.d == cQf.d && this.e == cQf.e;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r0v5, types: [int] */
            /* JADX WARN: Type inference failed for: r0v7, types: [int] */
            /* JADX WARN: Type inference failed for: r0v9, types: [int] */
            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v3, types: [int] */
            /* JADX WARN: Type inference failed for: r2v5, types: [int] */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r2v9 */
            public final int hashCode() {
                int iHashCode = this.a.hashCode() * 31;
                boolean z = this.b;
                ?? r2 = z;
                if (z) {
                    r2 = 1;
                }
                int i = (iHashCode + r2) * 31;
                boolean z2 = this.c;
                ?? r3 = z2;
                if (z2) {
                    r3 = 1;
                }
                int i2 = (i + r3) * 31;
                boolean z3 = this.d;
                ?? r4 = z3;
                if (z3) {
                    r4 = 1;
                }
                int i3 = (i2 + r4) * 31;
                boolean z4 = this.e;
                return i3 + (z4 ? 1 : z4);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ConnectedToDevice(deviceName=");
                sb.append(this.a);
                sb.append(", isAutoScoSelected=");
                sb.append(this.b);
                sb.append(", isScoActivated=");
                sb.append(this.c);
                sb.append(", isScoConnecting=");
                sb.append(this.d);
                sb.append(", hasScoError=");
                return Md5A.f(sb, this.e, ")");
            }
        }

        public static final class F1 extends QnHx {
            public static final F1 a = new F1();
        }

        /* JADX INFO: renamed from: pb$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0181QnHx extends QnHx {
            public static final C0181QnHx a = new C0181QnHx();
        }
    }

    public pb(Context context, lKy3 lky3, zb zbVar, kc kcVar) {
        this.a = context;
        this.b = lky3;
        this.c = zbVar;
        this.d = kcVar;
    }
}
