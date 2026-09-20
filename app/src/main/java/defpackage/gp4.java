package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gp4 implements Iterable<Integer>, jv1 {
    public static final gp4 A = new gp4(0, 0, 0, null);
    public final long w;
    public final long x;
    public final int y;
    public final int[] z;

    @if0(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, RCHTTPStatusCodes.UNSUCCESSFUL, 307}, m = "invokeSuspend")
    public static final class QnHx extends eq3 implements x81<z94<? super Integer>, z80<? super sd5>, Object> {
        public int A;
        public int B;
        public /* synthetic */ Object C;
        public int[] y;
        public int z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = gp4.this.new QnHx(z80Var);
            qnHx.C = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r2 r7 r10 r13
  0x0039: PHI (r2v15 int) = (r2v11 int), (r2v23 int) binds: [B:28:0x0096, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r7v9 gp4$QnHx) = (r7v7 gp4$QnHx), (r7v16 gp4$QnHx) binds: [B:28:0x0096, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r10v9 va0) = (r10v7 va0), (r10v13 va0) binds: [B:28:0x0096, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r13v11 z94) = (r13v9 z94), (r13v20 z94) binds: [B:28:0x0096, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x008c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0098  */
        /* JADX WARN: Code duplicated, block: B:31:0x00af A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0076 -> B:20:0x0079). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0096 -> B:11:0x0039). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ad -> B:32:0x00b0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gp4.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(z94<? super Integer> z94Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(z94Var, z80Var)).i(sd5.a);
        }
    }

    public gp4(long j, long j2, int i, int[] iArr) {
        this.w = j;
        this.x = j2;
        this.y = i;
        this.z = iArr;
    }

    public final gp4 a(gp4 gp4Var) {
        int[] iArr;
        gp4 gp4Var2 = A;
        if (gp4Var == gp4Var2) {
            return this;
        }
        if (this == gp4Var2) {
            return gp4Var2;
        }
        int i = this.y;
        if (gp4Var.y == i && gp4Var.z == (iArr = this.z)) {
            return new gp4(this.w & (~gp4Var.w), (~gp4Var.x) & this.x, i, iArr);
        }
        Iterator<Integer> it = gp4Var.iterator();
        gp4 gp4VarB = this;
        while (it.hasNext()) {
            gp4VarB = gp4VarB.b(it.next().intValue());
        }
        return gp4VarB;
    }

    public final gp4 b(int i) {
        int[] iArr;
        int iE;
        int i2 = this.y;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.x;
            if ((j2 & j) != 0) {
                return new gp4(this.w, j2 & (~j), i2, this.z);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.w;
            if ((j4 & j3) != 0) {
                return new gp4(j4 & (~j3), this.x, i2, this.z);
            }
        } else if (i3 < 0 && (iArr = this.z) != null && (iE = fp1.E(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new gp4(this.w, this.x, this.y, null);
            }
            int[] iArr2 = new int[length];
            if (iE > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iE + 0);
            }
            if (iE < length) {
                int i4 = iE + 1;
                System.arraycopy(iArr, i4, iArr2, iE, (length + 1) - i4);
            }
            return new gp4(this.w, this.x, this.y, iArr2);
        }
        return this;
    }

    public final boolean c(int i) {
        int[] iArr;
        int i2 = i - this.y;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.x) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.w) != 0;
        }
        if (i2 <= 0 && (iArr = this.z) != null) {
            return fp1.E(iArr, i) >= 0;
        }
        return false;
    }

    public final gp4 e(gp4 gp4Var) {
        int[] iArr;
        gp4 gp4Var2 = A;
        if (gp4Var == gp4Var2) {
            return this;
        }
        if (this == gp4Var2) {
            return gp4Var;
        }
        int i = this.y;
        if (gp4Var.y == i && gp4Var.z == (iArr = this.z)) {
            return new gp4(this.w | gp4Var.w, this.x | gp4Var.x, i, iArr);
        }
        if (this.z == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                gp4Var = gp4Var.f(it.next().intValue());
            }
            return gp4Var;
        }
        Iterator<Integer> it2 = gp4Var.iterator();
        gp4 gp4VarF = this;
        while (it2.hasNext()) {
            gp4VarF = gp4VarF.f(it2.next().intValue());
        }
        return gp4VarF;
    }

    public final gp4 f(int i) {
        long j;
        int i2;
        int i3 = this.y;
        int i4 = i - i3;
        long j2 = this.x;
        if (i4 < 0 || i4 >= 64) {
            long j3 = this.w;
            if (i4 < 64 || i4 >= 128) {
                int[] iArrD1 = this.z;
                if (i4 < 128) {
                    if (iArrD1 == null) {
                        return new gp4(this.w, this.x, i3, new int[]{i});
                    }
                    int iE = fp1.E(iArrD1, i);
                    if (iE < 0) {
                        int i5 = -(iE + 1);
                        int length = iArrD1.length + 1;
                        int[] iArr = new int[length];
                        System.arraycopy(iArrD1, 0, iArr, 0, i5 + 0);
                        System.arraycopy(iArrD1, i5, iArr, i5 + 1, (length - 1) - i5);
                        iArr[i5] = i;
                        return new gp4(this.w, this.x, this.y, iArr);
                    }
                } else if (!c(i)) {
                    int i6 = ((i + 1) / 64) * 64;
                    int i7 = this.y;
                    ArrayList arrayList = null;
                    long j4 = j3;
                    while (true) {
                        if (i7 >= i6) {
                            j = j2;
                            i2 = i7;
                            break;
                        }
                        if (j2 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrD1 != null) {
                                    for (int i8 : iArrD1) {
                                        arrayList.add(Integer.valueOf(i8));
                                    }
                                }
                            }
                            for (int i9 = 0; i9 < 64; i9++) {
                                if (((1 << i9) & j2) != 0) {
                                    arrayList.add(Integer.valueOf(i9 + i7));
                                }
                            }
                        }
                        if (j4 == 0) {
                            i2 = i6;
                            j = 0;
                            break;
                        }
                        i7 += 64;
                        j2 = j4;
                        j4 = 0;
                    }
                    if (arrayList != null) {
                        iArrD1 = wu.d1(arrayList);
                    }
                    return new gp4(j4, j, i2, iArrD1).f(i);
                }
            } else {
                long j5 = 1 << (i4 - 64);
                if ((j3 & j5) == 0) {
                    return new gp4(j3 | j5, this.x, i3, this.z);
                }
            }
        } else {
            long j6 = 1 << i4;
            if ((j2 & j6) == 0) {
                return new gp4(this.w, j2 | j6, i3, this.z);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        QnHx qnHx = new QnHx(null);
        y94 y94Var = new y94();
        y94Var.y = ps0.v(y94Var, y94Var, qnHx);
        return y94Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(mu.w0(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
