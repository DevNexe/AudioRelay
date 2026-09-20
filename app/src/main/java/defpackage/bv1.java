package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bv1 {
    public final LPt9Fixed a;
    public final boolean b;
    public int c;

    public bv1(mt1 mt1Var, LPt9Fixed lPt9) {
        this.a = lPt9;
        this.b = mt1Var.c;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0085 -> B:27:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.bv1 r13, defpackage.zf0 r14, defpackage.z80 r15) throws java.lang.Throwable {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof defpackage.av1
            if (r0 == 0) goto L16
            r0 = r15
            av1 r0 = (defpackage.av1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.F = r1
            goto L1b
        L16:
            av1 r0 = new av1
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.D
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 7
            r4 = 1
            r5 = 0
            r6 = 4
            r7 = 6
            r8 = 0
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.String r13 = r0.C
            java.util.LinkedHashMap r14 = r0.B
            bv1 r2 = r0.A
            zf0 r9 = r0.z
            defpackage.C0239D.H(r15)
            r10 = r1
            goto L8b
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            defpackage.C0239D.H(r15)
            LPt9Fixed r15 = r13.a
            byte r2 = r15.h(r7)
            byte r9 = r15.s()
            if (r9 == r6) goto Lc2
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            r9 = r1
            r12 = r15
            r15 = r14
            r14 = r12
        L58:
            LPt9Fixed r10 = r13.a
            boolean r10 = r10.b()
            if (r10 == 0) goto Lac
            boolean r2 = r13.b
            LPt9Fixed r10 = r13.a
            if (r2 == 0) goto L6b
            java.lang.String r2 = r10.l()
            goto L6f
        L6b:
            java.lang.String r2 = r10.k()
        L6f:
            r11 = 5
            r10.h(r11)
            sd5 r10 = defpackage.sd5.a
            r0.z = r15
            r0.A = r13
            r0.B = r14
            r0.C = r2
            r0.F = r4
            r15.a(r10, r0)
            if (r1 != r9) goto L85
            goto Lbb
        L85:
            r10 = r9
            r9 = r15
            r15 = r1
            r12 = r2
            r2 = r13
            r13 = r12
        L8b:
            vt1 r15 = (defpackage.vt1) r15
            r14.put(r13, r15)
            LPt9Fixed r13 = r2.a
            byte r13 = r13.g()
            if (r13 == r6) goto La6
            if (r13 != r3) goto L9e
            r12 = r2
            r2 = r13
            r13 = r12
            goto Lac
        L9e:
            LPt9Fixed r13 = r2.a
            java.lang.String r14 = "Expected end of the object or comma"
            defpackage.LPt9Fixed.o(r13, r14, r5, r8, r7)
            throw r8
        La6:
            r15 = r9
            r9 = r10
            r12 = r2
            r2 = r13
            r13 = r12
            goto L58
        Lac:
            LPt9Fixed r13 = r13.a
            if (r2 != r7) goto Lb4
            r13.h(r3)
            goto Lb6
        Lb4:
            if (r2 == r6) goto Lbc
        Lb6:
            pu1 r9 = new pu1
            r9.<init>(r14)
        Lbb:
            return r9
        Lbc:
            java.lang.String r14 = "Unexpected trailing comma"
            defpackage.LPt9Fixed.o(r13, r14, r5, r8, r7)
            throw r8
        Lc2:
            java.lang.String r13 = "Unexpected leading comma"
            defpackage.LPt9Fixed.o(r15, r13, r5, r8, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv1.a(bv1, zf0, z80):java.lang.Object");
    }

    public final vt1 b() throws Throwable {
        vt1 pu1Var;
        Object obj;
        LPt9Fixed lPt9 = this.a;
        byte bS = lPt9.s();
        if (bS == 1) {
            return d(true);
        }
        if (bS == 0) {
            return d(false);
        }
        if (bS != 6) {
            if (bS == 8) {
                return c();
            }
            LPt9Fixed.o(lPt9, GM.a("Cannot begin reading element, unexpected token: ", bS), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            ag0 ag0Var = new ag0(sd5.a, new zu1(this, null));
            while (true) {
                obj = ag0Var.z;
                z80<Object> z80Var = ag0Var.y;
                if (z80Var == null) {
                    break;
                }
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                if (ur1.a(va0Var, obj)) {
                    try {
                        y81<? super zf0<?, ?>, Object, ? super z80<Object>, ? extends Object> y81Var = ag0Var.w;
                        Object obj2 = ag0Var.x;
                        sb5.d(3, y81Var);
                        Object objInvoke = y81Var.invoke(ag0Var, obj2, z80Var);
                        if (objInvoke != va0Var) {
                            z80Var.x(objInvoke);
                        }
                    } catch (Throwable th) {
                        z80Var.x(new fq3.QnHx(th));
                    }
                } else {
                    ag0Var.z = va0Var;
                    z80Var.x(obj);
                }
            }
            C0239D.H(obj);
            pu1Var = (vt1) obj;
        } else {
            byte bH = lPt9.h((byte) 6);
            if (lPt9.s() == 4) {
                LPt9Fixed.o(lPt9, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (lPt9.b()) {
                String strL = this.b ? lPt9.l() : lPt9.k();
                lPt9.h((byte) 5);
                linkedHashMap.put(strL, b());
                bH = lPt9.g();
                if (bH != 4) {
                    if (bH == 7) {
                        break;
                    }
                    LPt9Fixed.o(lPt9, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bH == 6) {
                lPt9.h((byte) 7);
            } else if (bH == 4) {
                LPt9Fixed.o(lPt9, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
            pu1Var = new pu1(linkedHashMap);
        }
        this.c--;
        return pu1Var;
    }

    public final dt1 c() {
        LPt9Fixed lPt9 = this.a;
        byte bG = lPt9.g();
        if (lPt9.s() == 4) {
            LPt9Fixed.o(lPt9, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (lPt9.b()) {
            arrayList.add(b());
            bG = lPt9.g();
            if (bG != 4) {
                boolean z = bG == 9;
                int i = lPt9.a;
                if (!z) {
                    LPt9Fixed.o(lPt9, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bG == 8) {
            lPt9.h((byte) 9);
        } else if (bG == 4) {
            LPt9Fixed.o(lPt9, "Unexpected trailing comma", 0, null, 6);
            throw null;
        }
        return new dt1(arrayList);
    }

    public final su1 d(boolean z) {
        boolean z2 = this.b;
        LPt9Fixed lPt9 = this.a;
        String strL = (z2 || !z) ? lPt9.l() : lPt9.k();
        return (z || !ur1.a(strL, "null")) ? new ku1(strL, z) : nu1.INSTANCE;
    }
}
