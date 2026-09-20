package com.google.protobuf;

import defpackage.N;
import defpackage.ex0;
import defpackage.fc2;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class Descriptors {
    public static final Logger a = Logger.getLogger(Descriptors.class.getName());
    public static final int[] b = new int[0];
    public static final QnHx[] c = new QnHx[0];
    public static final NUlFixed[] d = new NUlFixed[0];
    public static final F1[] e = new F1[0];
    public static final EQ[] f = new EQ[0];
    public static final byN[] g = new byN[0];

    public static final class CQf {
        public final Set<YKK> a;
        public final HashMap c = new HashMap();
        public final boolean b = true;

        public static final class QnHx extends auxFixed {
            public final String w;
            public final String x;
            public final YKK y;

            public QnHx(String str, String str2, YKK ykk) {
                this.y = ykk;
                this.x = str2;
                this.w = str;
            }

            @Override // com.google.protobuf.Descriptors.auxFixed
            public final YKK a() {
                return this.y;
            }

            @Override // com.google.protobuf.Descriptors.auxFixed
            public final String c() {
                return this.x;
            }

            @Override // com.google.protobuf.Descriptors.auxFixed
            public final String d() {
                return this.w;
            }

            @Override // com.google.protobuf.Descriptors.auxFixed
            public final mw0t e() {
                return this.y.w;
            }
        }

        public CQf(YKK[] ykkArr) {
            this.a = Collections.newSetFromMap(new IdentityHashMap(ykkArr.length));
            for (YKK ykk : ykkArr) {
                this.a.add(ykk);
                d(ykk);
            }
            for (YKK ykk2 : this.a) {
                try {
                    a(ykk2, ykk2.w.U());
                } catch (DescriptorValidationException e) {
                    throw new AssertionError(e);
                }
            }
        }

        public final void a(YKK ykk, String str) throws DescriptorValidationException {
            String strSubstring;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                strSubstring = str;
            } else {
                a(ykk, str.substring(0, iLastIndexOf));
                strSubstring = str.substring(iLastIndexOf + 1);
            }
            QnHx qnHx = new QnHx(strSubstring, str, ykk);
            HashMap map = this.c;
            auxFixed auxVar = (auxFixed) map.put(str, qnHx);
            if (auxVar != null) {
                map.put(str, auxVar);
                if (auxVar instanceof QnHx) {
                    return;
                }
                StringBuilder sbA = N.a("\"", strSubstring, "\" is already defined (as something other than a package) in file \"");
                sbA.append(auxVar.a().d());
                sbA.append("\".");
                throw new DescriptorValidationException(ykk, sbA.toString());
            }
        }

        public final void b(auxFixed auxVar) throws DescriptorValidationException {
            String strD = auxVar.d();
            if (strD.length() == 0) {
                throw new DescriptorValidationException(auxVar, "Missing name.");
            }
            for (int i = 0; i < strD.length(); i++) {
                char cCharAt = strD.charAt(i);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i <= 0))) {
                    throw new DescriptorValidationException(auxVar, fc2.a("\"", strD, "\" is not a valid identifier."));
                }
            }
            String strC = auxVar.c();
            HashMap map = this.c;
            auxFixed auxVar2 = (auxFixed) map.put(strC, auxVar);
            if (auxVar2 != null) {
                map.put(strC, auxVar2);
                if (auxVar.a() != auxVar2.a()) {
                    StringBuilder sbA = N.a("\"", strC, "\" is already defined in file \"");
                    sbA.append(auxVar2.a().d());
                    sbA.append("\".");
                    throw new DescriptorValidationException(auxVar, sbA.toString());
                }
                int iLastIndexOf = strC.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    throw new DescriptorValidationException(auxVar, fc2.a("\"", strC, "\" is already defined."));
                }
                throw new DescriptorValidationException(auxVar, "\"" + strC.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strC.substring(0, iLastIndexOf) + "\".");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
        
            if (((r0 instanceof com.google.protobuf.Descriptors.QnHx) || (r0 instanceof com.google.protobuf.Descriptors.F1) || (r0 instanceof com.google.protobuf.Descriptors.CQf.QnHx) || (r0 instanceof com.google.protobuf.Descriptors.EQ)) != false) goto L27;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.protobuf.Descriptors.auxFixed c(java.lang.String r8, int r9) {
            /*
                r7 = this;
                java.util.HashMap r0 = r7.c
                java.lang.Object r0 = r0.get(r8)
                com.google.protobuf.Descriptors$aux r0 = (com.google.protobuf.Descriptors.auxFixed) r0
                r1 = 0
                r2 = 2
                r3 = 1
                r4 = 3
                if (r0 == 0) goto L39
                if (r9 == r4) goto L38
                if (r9 != r3) goto L20
                boolean r5 = r0 instanceof com.google.protobuf.Descriptors.QnHx
                if (r5 != 0) goto L1d
                boolean r5 = r0 instanceof com.google.protobuf.Descriptors.F1
                if (r5 == 0) goto L1b
                goto L1d
            L1b:
                r5 = 0
                goto L1e
            L1d:
                r5 = 1
            L1e:
                if (r5 != 0) goto L38
            L20:
                if (r9 != r2) goto L39
                boolean r5 = r0 instanceof com.google.protobuf.Descriptors.QnHx
                if (r5 != 0) goto L35
                boolean r5 = r0 instanceof com.google.protobuf.Descriptors.F1
                if (r5 != 0) goto L35
                boolean r5 = r0 instanceof com.google.protobuf.Descriptors.CQf.QnHx
                if (r5 != 0) goto L35
                boolean r5 = r0 instanceof com.google.protobuf.Descriptors.EQ
                if (r5 == 0) goto L33
                goto L35
            L33:
                r5 = 0
                goto L36
            L35:
                r5 = 1
            L36:
                if (r5 == 0) goto L39
            L38:
                return r0
            L39:
                java.util.Set<com.google.protobuf.Descriptors$YKK> r0 = r7.a
                java.util.Iterator r0 = r0.iterator()
            L3f:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L82
                java.lang.Object r5 = r0.next()
                com.google.protobuf.Descriptors$YKK r5 = (com.google.protobuf.Descriptors.YKK) r5
                com.google.protobuf.Descriptors$CQf r5 = r5.C
                java.util.HashMap r5 = r5.c
                java.lang.Object r5 = r5.get(r8)
                com.google.protobuf.Descriptors$aux r5 = (com.google.protobuf.Descriptors.auxFixed) r5
                if (r5 == 0) goto L3f
                if (r9 == r4) goto L81
                if (r9 != r3) goto L69
                boolean r6 = r5 instanceof com.google.protobuf.Descriptors.QnHx
                if (r6 != 0) goto L66
                boolean r6 = r5 instanceof com.google.protobuf.Descriptors.F1
                if (r6 == 0) goto L64
                goto L66
            L64:
                r6 = 0
                goto L67
            L66:
                r6 = 1
            L67:
                if (r6 != 0) goto L81
            L69:
                if (r9 != r2) goto L3f
                boolean r6 = r5 instanceof com.google.protobuf.Descriptors.QnHx
                if (r6 != 0) goto L7e
                boolean r6 = r5 instanceof com.google.protobuf.Descriptors.F1
                if (r6 != 0) goto L7e
                boolean r6 = r5 instanceof com.google.protobuf.Descriptors.CQf.QnHx
                if (r6 != 0) goto L7e
                boolean r6 = r5 instanceof com.google.protobuf.Descriptors.EQ
                if (r6 == 0) goto L7c
                goto L7e
            L7c:
                r6 = 0
                goto L7f
            L7e:
                r6 = 1
            L7f:
                if (r6 == 0) goto L3f
            L81:
                return r5
            L82:
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Descriptors.CQf.c(java.lang.String, int):com.google.protobuf.Descriptors$aux");
        }

        public final void d(YKK ykk) {
            for (YKK ykk2 : Collections.unmodifiableList(Arrays.asList(ykk.B))) {
                if (this.a.add(ykk2)) {
                    d(ykk2);
                }
            }
        }

        public final auxFixed e(String str, auxFixed auxVar) throws DescriptorValidationException {
            auxFixed auxVarC;
            String string;
            if (str.startsWith(".")) {
                string = str.substring(1);
                auxVarC = c(string, 1);
            } else {
                int iIndexOf = str.indexOf(46);
                String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
                StringBuilder sb = new StringBuilder(auxVar.c());
                while (true) {
                    int iLastIndexOf = sb.lastIndexOf(".");
                    if (iLastIndexOf == -1) {
                        auxVarC = c(str, 1);
                        string = str;
                        break;
                    }
                    int i = iLastIndexOf + 1;
                    sb.setLength(i);
                    sb.append(strSubstring);
                    auxFixed auxVarC2 = c(sb.toString(), 2);
                    if (auxVarC2 != null) {
                        if (iIndexOf != -1) {
                            sb.setLength(i);
                            sb.append(str);
                            auxVarC = c(sb.toString(), 1);
                        } else {
                            auxVarC = auxVarC2;
                        }
                        string = sb.toString();
                        break;
                    }
                    sb.setLength(iLastIndexOf);
                }
            }
            if (auxVarC != null) {
                return auxVarC;
            }
            if (!this.b) {
                throw new DescriptorValidationException(auxVar, fc2.a("\"", str, "\" is not defined."));
            }
            Descriptors.a.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
            QnHx qnHx = new QnHx(string);
            this.a.add(qnHx.y);
            return qnHx;
        }
    }

    public static final class EQ extends auxFixed {
        public final com.google.protobuf.EQ.LPt6Fixed w;
        public final String x;
        public final YKK y;
        public final T23[] z;

        public EQ(com.google.protobuf.EQ.LPt6Fixed lPt6, YKK ykk) throws DescriptorValidationException {
            this.w = lPt6;
            this.x = Descriptors.a(ykk, null, lPt6.S());
            this.y = ykk;
            this.z = new T23[lPt6.B.size()];
            for (int i = 0; i < lPt6.B.size(); i++) {
                this.z[i] = new T23(lPt6.B.get(i), ykk, this);
            }
            ykk.C.b(this);
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this.y;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.x;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.w.S();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.w;
        }
    }

    public static final class F1 extends auxFixed {
        public final LPt8Fixed[] A;
        public final int B;
        public HashMap C = null;
        public ReferenceQueue<LPt8Fixed> D = null;
        public final com.google.protobuf.EQ.CQf w;
        public final String x;
        public final YKK y;
        public final LPt8Fixed[] z;

        public static class QnHx extends WeakReference<LPt8Fixed> {
            public final int a;

            public QnHx(int i, LPt8Fixed lPt8) {
                super(lPt8);
                this.a = i;
            }
        }

        public F1(com.google.protobuf.EQ.CQf cQf, YKK ykk, QnHx qnHx) throws DescriptorValidationException {
            this.w = cQf;
            this.x = Descriptors.a(ykk, qnHx, cQf.S());
            this.y = ykk;
            if (cQf.U() == 0) {
                throw new DescriptorValidationException(this, "Enums must contain at least one value.");
            }
            this.z = new LPt8Fixed[cQf.U()];
            int i = 0;
            for (int i2 = 0; i2 < cQf.U(); i2++) {
                this.z[i2] = new LPt8Fixed(cQf.B.get(i2), ykk, this);
            }
            LPt8Fixed[] lPt8Arr = (LPt8Fixed[]) this.z.clone();
            this.A = lPt8Arr;
            Arrays.sort(lPt8Arr, LPt8Fixed.z);
            for (int i3 = 1; i3 < cQf.U(); i3++) {
                LPt8Fixed[] lPt8Arr2 = this.A;
                LPt8Fixed lPt8 = lPt8Arr2[i];
                LPt8Fixed lPt9 = lPt8Arr2[i3];
                if (lPt8.w.B != lPt9.w.B) {
                    i++;
                    lPt8Arr2[i] = lPt9;
                }
            }
            int i4 = i + 1;
            this.B = i4;
            Arrays.fill(this.A, i4, cQf.U(), (Object) null);
            ykk.C.b(this);
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this.y;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.x;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.w.S();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.w;
        }

        public final LPt8Fixed g(int i) {
            int i2 = this.B - 1;
            int i3 = 0;
            while (i3 <= i2) {
                int i4 = (i3 + i2) / 2;
                LPt8Fixed lPt8 = this.A[i4];
                int i5 = lPt8.w.B;
                if (i < i5) {
                    i2 = i4 - 1;
                } else {
                    if (i <= i5) {
                        return lPt8;
                    }
                    i3 = i4 + 1;
                }
            }
            return null;
        }

        public final LPt8Fixed l(int i) {
            LPt8Fixed lPt8;
            LPt8Fixed lPt8G = g(i);
            if (lPt8G != null) {
                return lPt8G;
            }
            synchronized (this) {
                if (this.D == null) {
                    this.D = new ReferenceQueue<>();
                    this.C = new HashMap();
                } else {
                    while (true) {
                        QnHx qnHx = (QnHx) this.D.poll();
                        if (qnHx == null) {
                            break;
                        }
                        this.C.remove(Integer.valueOf(qnHx.a));
                    }
                }
                WeakReference weakReference = (WeakReference) this.C.get(Integer.valueOf(i));
                lPt8 = weakReference == null ? null : (LPt8Fixed) weakReference.get();
                if (lPt8 == null) {
                    lPt8 = new LPt8Fixed(this, Integer.valueOf(i));
                    this.C.put(Integer.valueOf(i), new QnHx(i, lPt8));
                }
            }
            return lPt8;
        }
    }

    public static final class NUlFixed extends auxFixed implements Comparable<NUlFixed>, Xn1.CQf<NUlFixed> {
        public static final QnHx I = new QnHx();
        public static final LF.QnHx[] J = LF.QnHx.values();
        public final QnHx A;
        public final boolean B;
        public F1 C;
        public QnHx D;
        public QnHx E;
        public final byN F;
        public F1 G;
        public Object H;
        public final int w;
        public final com.google.protobuf.EQ.auxFixed x;
        public final String y;
        public final YKK z;

        public enum CQf {
            x("INT"),
            y("LONG"),
            z("FLOAT"),
            A("DOUBLE"),
            B("BOOLEAN"),
            C("STRING"),
            D("BYTE_STRING"),
            E("ENUM"),
            F("MESSAGE");

            public final Object w;

            CQf(String str) {
                this.w = serializable;
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static final class F1 {
            public static final F1 A;
            public static final F1 B;
            public static final F1[] C;
            public static final /* synthetic */ F1[] D;
            public static final F1 x;
            public static final F1 y;
            public static final F1 z;
            public final CQf w;

            /* JADX INFO: Fake field, exist only in values array */
            F1 EF0;

            /* JADX INFO: Fake field, exist only in values array */
            F1 EF1;

            /* JADX INFO: Fake field, exist only in values array */
            F1 EF2;

            static {
                F1 f1 = new F1("DOUBLE", 0, CQf.A);
                F1 f2 = new F1("FLOAT", 1, CQf.z);
                CQf cQf = CQf.y;
                F1 f3 = new F1("INT64", 2, cQf);
                F1 f4 = new F1("UINT64", 3, cQf);
                CQf cQf2 = CQf.x;
                F1 f5 = new F1("INT32", 4, cQf2);
                F1 f6 = new F1("FIXED64", 5, cQf);
                F1 f7 = new F1("FIXED32", 6, cQf2);
                F1 f8 = new F1("BOOL", 7, CQf.B);
                F1 f9 = new F1("STRING", 8, CQf.C);
                x = f9;
                CQf cQf3 = CQf.F;
                F1 f10 = new F1("GROUP", 9, cQf3);
                y = f10;
                F1 f11 = new F1("MESSAGE", 10, cQf3);
                z = f11;
                F1 f12 = new F1("BYTES", 11, CQf.D);
                A = f12;
                F1 f13 = new F1("UINT32", 12, cQf2);
                F1 f14 = new F1("ENUM", 13, CQf.E);
                B = f14;
                D = new F1[]{f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, new F1("SFIXED32", 14, cQf2), new F1("SFIXED64", 15, cQf), new F1("SINT32", 16, cQf2), new F1("SINT64", 17, cQf)};
                C = values();
            }

            public F1(String str, int i, CQf cQf) {
                super(str, i);
                this.w = cQf;
            }

            public static F1 valueOf(String str) {
                return (F1) Enum.valueOf(F1.class, str);
            }

            public static F1[] values() {
                return (F1[]) D.clone();
            }
        }

        public static class QnHx {
            public final int a(Object obj) {
                return ((NUlFixed) obj).x.B;
            }
        }

        static {
            if (F1.C.length != com.google.protobuf.EQ.auxFixed.LPt8Fixed.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        public NUlFixed(com.google.protobuf.EQ.auxFixed auxVar, YKK ykk, QnHx qnHx, int i, boolean z) throws DescriptorValidationException {
            this.w = i;
            this.x = auxVar;
            this.y = Descriptors.a(ykk, qnHx, auxVar.V());
            this.z = ykk;
            if (auxVar.c0()) {
                com.google.protobuf.EQ.auxFixed.LPt8Fixed lPt8A = com.google.protobuf.EQ.auxFixed.LPt8Fixed.a(auxVar.D);
                this.C = F1.C[(lPt8A == null ? com.google.protobuf.EQ.auxFixed.LPt8Fixed.TYPE_DOUBLE : lPt8A).w - 1];
            }
            this.B = auxVar.K;
            if (auxVar.B <= 0) {
                throw new DescriptorValidationException(this, "Field numbers must be positive integers.");
            }
            if (z) {
                if (!auxVar.Z()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.");
                }
                this.D = null;
                if (qnHx != null) {
                    this.A = qnHx;
                } else {
                    this.A = null;
                }
                if (auxVar.a0()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.");
                }
                this.F = null;
            } else {
                if (auxVar.Z()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.");
                }
                this.D = qnHx;
                if (auxVar.a0()) {
                    int i2 = auxVar.H;
                    if (i2 < 0 || i2 >= qnHx.w.U()) {
                        throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + qnHx.d());
                    }
                    byN byn = qnHx.p().get(auxVar.H);
                    this.F = byn;
                    byn.B++;
                } else {
                    this.F = null;
                }
                this.A = null;
            }
            ykk.C.b(this);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void g(NUlFixed nUl) throws DescriptorValidationException {
            com.google.protobuf.EQ.auxFixed auxVar = nUl.x;
            boolean Z = auxVar.Z();
            YKK ykk = nUl.z;
            if (Z) {
                auxFixed auxVarE = ykk.C.e(auxVar.T(), nUl);
                if (!(auxVarE instanceof QnHx)) {
                    throw new DescriptorValidationException(nUl, "\"" + auxVar.T() + "\" is not a message type.");
                }
                QnHx qnHx = (QnHx) auxVarE;
                nUl.D = qnHx;
                int i = auxVar.B;
                int iBinarySearch = Arrays.binarySearch(qnHx.F, i);
                if (iBinarySearch < 0) {
                    iBinarySearch = (~iBinarySearch) - 1;
                }
                if (!(iBinarySearch >= 0 && i < qnHx.G[iBinarySearch])) {
                    StringBuilder sb = new StringBuilder("\"");
                    sb.append(nUl.D.x);
                    sb.append("\" does not declare ");
                    throw new DescriptorValidationException(nUl, ex0.c(sb, auxVar.B, " as an extension number."));
                }
            }
            if (auxVar.d0()) {
                auxFixed auxVarE2 = ykk.C.e(auxVar.X(), nUl);
                if (!auxVar.c0()) {
                    if (auxVarE2 instanceof QnHx) {
                        nUl.C = F1.z;
                    } else {
                        if (!(auxVarE2 instanceof F1)) {
                            throw new DescriptorValidationException(nUl, "\"" + auxVar.X() + "\" is not a type.");
                        }
                        nUl.C = F1.B;
                    }
                }
                CQf cQf = nUl.C.w;
                if (cQf == CQf.F) {
                    if (!(auxVarE2 instanceof QnHx)) {
                        throw new DescriptorValidationException(nUl, "\"" + auxVar.X() + "\" is not a message type.");
                    }
                    nUl.E = (QnHx) auxVarE2;
                    if (auxVar.Y()) {
                        throw new DescriptorValidationException(nUl, "Messages can't have default values.");
                    }
                } else {
                    if (cQf != CQf.E) {
                        throw new DescriptorValidationException(nUl, "Field with primitive type has type_name.");
                    }
                    if (!(auxVarE2 instanceof F1)) {
                        throw new DescriptorValidationException(nUl, "\"" + auxVar.X() + "\" is not an enum type.");
                    }
                    nUl.G = (F1) auxVarE2;
                }
            } else {
                CQf cQf2 = nUl.C.w;
                if (cQf2 == CQf.F || cQf2 == CQf.E) {
                    throw new DescriptorValidationException(nUl, "Field with message or enum type missing type_name.");
                }
            }
            if (auxVar.W().C && !nUl.r()) {
                throw new DescriptorValidationException(nUl, "[packed = true] can only be specified for repeated primitive fields.");
            }
            if (auxVar.Y()) {
                if (nUl.f()) {
                    throw new DescriptorValidationException(nUl, "Repeated fields cannot have default values.");
                }
                try {
                    switch (nUl.C.ordinal()) {
                        case 0:
                            if (auxVar.S().equals("inf")) {
                                nUl.H = Double.valueOf(Double.POSITIVE_INFINITY);
                            } else if (auxVar.S().equals("-inf")) {
                                nUl.H = Double.valueOf(Double.NEGATIVE_INFINITY);
                            } else if (!auxVar.S().equals("nan")) {
                                nUl.H = Double.valueOf(auxVar.S());
                            } else {
                                nUl.H = Double.valueOf(Double.NaN);
                            }
                            break;
                        case 1:
                            if (auxVar.S().equals("inf")) {
                                nUl.H = Float.valueOf(Float.POSITIVE_INFINITY);
                            } else if (auxVar.S().equals("-inf")) {
                                nUl.H = Float.valueOf(Float.NEGATIVE_INFINITY);
                            } else if (!auxVar.S().equals("nan")) {
                                nUl.H = Float.valueOf(auxVar.S());
                            } else {
                                nUl.H = Float.valueOf(Float.NaN);
                            }
                            break;
                        case 2:
                        case 15:
                        case 17:
                            nUl.H = Long.valueOf(TextFormat.c(auxVar.S(), true, true));
                            break;
                        case 3:
                        case 5:
                            nUl.H = Long.valueOf(TextFormat.c(auxVar.S(), false, true));
                            break;
                        case 4:
                        case 14:
                        case 16:
                            nUl.H = Integer.valueOf((int) TextFormat.c(auxVar.S(), true, false));
                            break;
                        case 6:
                        case 12:
                            nUl.H = Integer.valueOf((int) TextFormat.c(auxVar.S(), false, false));
                            break;
                        case 7:
                            nUl.H = Boolean.valueOf(auxVar.S());
                            break;
                        case 8:
                            nUl.H = auxVar.S();
                            break;
                        case 9:
                        case 10:
                            throw new DescriptorValidationException(nUl, "Message type had default value.");
                        case 11:
                            try {
                                nUl.H = TextFormat.d(auxVar.S());
                            } catch (TextFormat.InvalidEscapeSequenceException e) {
                                DescriptorValidationException descriptorValidationException = new DescriptorValidationException(nUl, "Couldn't parse default value: " + e.getMessage());
                                descriptorValidationException.initCause(e);
                                throw descriptorValidationException;
                            }
                            break;
                        case 13:
                            F1 f1 = nUl.G;
                            String strS = auxVar.S();
                            auxFixed auxVarC = f1.y.C.c(f1.x + '.' + strS, 3);
                            LPt8Fixed lPt8 = auxVarC instanceof LPt8Fixed ? (LPt8Fixed) auxVarC : null;
                            nUl.H = lPt8;
                            if (lPt8 == null) {
                                throw new DescriptorValidationException(nUl, "Unknown enum default value: \"" + auxVar.S() + '\"');
                            }
                            break;
                            break;
                    }
                } catch (NumberFormatException e2) {
                    DescriptorValidationException descriptorValidationException2 = new DescriptorValidationException(nUl, "Could not parse default value: \"" + auxVar.S() + '\"');
                    descriptorValidationException2.initCause(e2);
                    throw descriptorValidationException2;
                }
            } else if (nUl.f()) {
                nUl.H = Collections.emptyList();
            } else {
                int iOrdinal = nUl.C.w.ordinal();
                if (iOrdinal == 7) {
                    nUl.H = Collections.unmodifiableList(Arrays.asList(nUl.G.z)).get(0);
                } else if (iOrdinal != 8) {
                    nUl.H = nUl.C.w.w;
                } else {
                    nUl.H = null;
                }
            }
            QnHx qnHx2 = nUl.D;
            if (qnHx2 == null || !qnHx2.q().B) {
                return;
            }
            if (!nUl.o()) {
                throw new DescriptorValidationException(nUl, "MessageSets cannot have fields, only extensions.");
            }
            if (!nUl.q() || nUl.C != F1.z) {
                throw new DescriptorValidationException(nUl, "Extensions of MessageSets must be optional messages.");
            }
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this.z;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final int b() {
            return this.x.B;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.y;
        }

        @Override // java.lang.Comparable
        public final int compareTo(NUlFixed nUl) {
            NUlFixed nUl2 = nUl;
            if (nUl2.D == this.D) {
                return this.x.B - nUl2.x.B;
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.x.V();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.x;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final boolean f() {
            com.google.protobuf.EQ.auxFixed.F1 f1A = com.google.protobuf.EQ.auxFixed.F1.a(this.x.C);
            if (f1A == null) {
                f1A = com.google.protobuf.EQ.auxFixed.F1.LABEL_OPTIONAL;
            }
            return f1A == com.google.protobuf.EQ.auxFixed.F1.LABEL_REPEATED;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final LF.QnHx h() {
            return J[this.C.ordinal()];
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final DzVS.QnHx i(DzVS.QnHx qnHx, DzVS dzVS) {
            return ((mw0t.QnHx) qnHx).s((mw0t) dzVS);
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final LF.CQf j() {
            return h().w;
        }

        @Override // com.google.protobuf.Xn1.CQf
        public final boolean k() {
            if (!r()) {
                return false;
            }
            int iM = this.z.m();
            com.google.protobuf.EQ.auxFixed auxVar = this.x;
            if (iM == 2) {
                return auxVar.W().C;
            }
            return !auxVar.W().V() || auxVar.W().C;
        }

        public final Object l() {
            if (this.C.w != CQf.F) {
                return this.H;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public final F1 m() {
            if (this.C.w == CQf.E) {
                return this.G;
            }
            throw new UnsupportedOperationException(String.format("This field is not of enum type. (%s)", this.y));
        }

        public final QnHx n() {
            if (this.C.w == CQf.F) {
                return this.E;
            }
            throw new UnsupportedOperationException(String.format("This field is not of message type. (%s)", this.y));
        }

        public final boolean o() {
            return this.x.Z();
        }

        public final boolean p() {
            return this.C == F1.z && f() && n().q().E;
        }

        public final boolean q() {
            com.google.protobuf.EQ.auxFixed.F1 f1A = com.google.protobuf.EQ.auxFixed.F1.a(this.x.C);
            if (f1A == null) {
                f1A = com.google.protobuf.EQ.auxFixed.F1.LABEL_OPTIONAL;
            }
            return f1A == com.google.protobuf.EQ.auxFixed.F1.LABEL_OPTIONAL;
        }

        public final boolean r() {
            return f() && h().a();
        }

        public final boolean s() {
            com.google.protobuf.EQ.auxFixed.F1 f1A = com.google.protobuf.EQ.auxFixed.F1.a(this.x.C);
            if (f1A == null) {
                f1A = com.google.protobuf.EQ.auxFixed.F1.LABEL_OPTIONAL;
            }
            return f1A == com.google.protobuf.EQ.auxFixed.F1.LABEL_REQUIRED;
        }

        public final boolean t() {
            if (this.C != F1.x) {
                return false;
            }
            if (this.D.q().E) {
                return true;
            }
            YKK ykk = this.z;
            if (ykk.m() == 3) {
                return true;
            }
            return ykk.w.T().F;
        }

        public final String toString() {
            return this.y;
        }
    }

    public static final class T23 extends auxFixed {
        public final com.google.protobuf.EQ.PRnFixed w;
        public final String x;
        public final YKK y;

        public T23(com.google.protobuf.EQ.PRnFixed pRn, YKK ykk, EQ eq) throws DescriptorValidationException {
            this.w = pRn;
            this.y = ykk;
            this.x = eq.x + '.' + pRn.T();
            ykk.C.b(this);
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this.y;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.x;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.w.T();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.w;
        }
    }

    public static abstract class auxFixed {
        public abstract YKK a();

        public abstract String c();

        public abstract String d();

        public abstract mw0t e();
    }

    public static final class byN extends auxFixed {
        public final QnHx A;
        public int B = 0;
        public NUlFixed[] C;
        public final int w;
        public final com.google.protobuf.EQ.RBi x;
        public final String y;
        public final YKK z;

        public byN(com.google.protobuf.EQ.RBi rBi, YKK ykk, QnHx qnHx, int i) {
            this.x = rBi;
            this.y = Descriptors.a(ykk, qnHx, rBi.S());
            this.z = ykk;
            this.w = i;
            this.A = qnHx;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this.z;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.y;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.x.S();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.x;
        }

        public final boolean g() {
            NUlFixed[] nUlArr = this.C;
            return nUlArr.length == 1 && nUlArr[0].B;
        }
    }

    public static String a(YKK ykk, QnHx qnHx, String str) {
        if (qnHx != null) {
            return qnHx.x + '.' + str;
        }
        String strU = ykk.w.U();
        if (strU.isEmpty()) {
            return str;
        }
        return strU + '.' + str;
    }

    public static class DescriptorValidationException extends Exception {
        public final mw0t w;

        public /* synthetic */ DescriptorValidationException() {
            throw null;
        }

        public DescriptorValidationException(auxFixed auxVar, String str) {
            super(auxVar.c() + ": " + str);
            auxVar.c();
            this.w = auxVar.e();
        }

        public DescriptorValidationException(YKK ykk, String str) {
            super(ykk.d() + ": " + str);
            ykk.d();
        }
    }

    public static final class LPt8Fixed extends auxFixed implements SjP.QnHx {
        public static final QnHx z = new QnHx();
        public final com.google.protobuf.EQ.LPt8Fixed w;
        public final String x;
        public final F1 y;

        public static class CQf {
        }

        public static class QnHx implements Comparator<LPt8Fixed> {
            @Override // java.util.Comparator
            public final int compare(LPt8Fixed lPt8, LPt8Fixed lPt9) {
                return Integer.valueOf(lPt8.w.B).compareTo(Integer.valueOf(lPt9.w.B));
            }
        }

        static {
            new CQf();
        }

        public LPt8Fixed(com.google.protobuf.EQ.LPt8Fixed lPt8, YKK ykk, F1 f1) throws DescriptorValidationException {
            this.w = lPt8;
            this.y = f1;
            this.x = f1.x + '.' + lPt8.S();
            ykk.C.b(this);
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this.y.y;
        }

        @Override // com.google.protobuf.SjP.QnHx
        public final int b() {
            return this.w.B;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.x;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.w.S();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.w;
        }

        public final String toString() {
            return this.w.S();
        }

        public LPt8Fixed(F1 f1, Integer num) {
            String str = "UNKNOWN_ENUM_VALUE_" + f1.d() + "_" + num;
            com.google.protobuf.EQ.LPt8Fixed.CQf cQfV = com.google.protobuf.EQ.LPt8Fixed.E.c();
            str.getClass();
            cQfV.A |= 1;
            cQfV.B = str;
            cQfV.M();
            int iIntValue = num.intValue();
            cQfV.A |= 2;
            cQfV.C = iIntValue;
            cQfV.M();
            com.google.protobuf.EQ.LPt8Fixed lPt8Q = cQfV.f();
            if (lPt8Q.isInitialized()) {
                this.w = lPt8Q;
                this.y = f1;
                this.x = f1.x + '.' + lPt8Q.S();
                return;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt8Q);
        }
    }

    public static final class YKK extends auxFixed {
        public final NUlFixed[] A;
        public final YKK[] B;
        public final CQf C;
        public final com.google.protobuf.EQ.byN w;
        public final QnHx[] x;
        public final F1[] y;
        public final EQ[] z;

        public YKK(com.google.protobuf.EQ.byN byn, YKK[] ykkArr, CQf cQf) throws DescriptorValidationException {
            this.C = cQf;
            this.w = byn;
            HashMap map = new HashMap();
            for (YKK ykk : ykkArr) {
                map.put(ykk.d(), ykk);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < byn.D.size(); i++) {
                int iD = ((ck32) byn.D).d(i);
                if (iD < 0 || iD >= byn.C.size()) {
                    throw new DescriptorValidationException(this, "Invalid public dependency index.");
                }
                YKK ykk2 = (YKK) map.get((String) byn.C.get(iD));
                if (ykk2 != null) {
                    arrayList.add(ykk2);
                }
            }
            YKK[] ykkArr2 = new YKK[arrayList.size()];
            this.B = ykkArr2;
            arrayList.toArray(ykkArr2);
            cQf.a(this, this.w.U());
            this.x = byn.F.size() > 0 ? new QnHx[byn.F.size()] : Descriptors.c;
            for (int i2 = 0; i2 < byn.F.size(); i2++) {
                this.x[i2] = new QnHx(byn.F.get(i2), this, null);
            }
            this.y = byn.G.size() > 0 ? new F1[byn.G.size()] : Descriptors.e;
            for (int i3 = 0; i3 < byn.G.size(); i3++) {
                this.y[i3] = new F1(byn.G.get(i3), this, null);
            }
            this.z = byn.H.size() > 0 ? new EQ[byn.H.size()] : Descriptors.f;
            for (int i4 = 0; i4 < byn.H.size(); i4++) {
                this.z[i4] = new EQ(byn.H.get(i4), this);
            }
            this.A = byn.I.size() > 0 ? new NUlFixed[byn.I.size()] : Descriptors.d;
            for (int i5 = 0; i5 < byn.I.size(); i5++) {
                this.A[i5] = new NUlFixed(byn.I.get(i5), this, null, i5, true);
            }
        }

        public static YKK g(com.google.protobuf.EQ.byN byn, YKK[] ykkArr) throws DescriptorValidationException {
            YKK ykk = new YKK(byn, ykkArr, new CQf(ykkArr));
            for (QnHx qnHx : ykk.x) {
                qnHx.g();
            }
            for (EQ eq : ykk.z) {
                for (T23 t23 : eq.z) {
                    YKK ykk2 = t23.y;
                    CQf cQf = ykk2.C;
                    com.google.protobuf.EQ.PRnFixed pRn = t23.w;
                    auxFixed auxVarE = cQf.e(pRn.S(), t23);
                    if (!(auxVarE instanceof QnHx)) {
                        throw new DescriptorValidationException(t23, "\"" + pRn.S() + "\" is not a message type.");
                    }
                    auxFixed auxVarE2 = ykk2.C.e(pRn.V(), t23);
                    if (!(auxVarE2 instanceof QnHx)) {
                        throw new DescriptorValidationException(t23, "\"" + pRn.V() + "\" is not a message type.");
                    }
                }
            }
            for (NUlFixed nUl : ykk.A) {
                NUlFixed.g(nUl);
            }
            return ykk;
        }

        public static YKK n(String[] strArr, YKK[] ykkArr) {
            byte[] bytes;
            if (strArr.length == 1) {
                bytes = strArr[0].getBytes(SjP.b);
            } else {
                StringBuilder sb = new StringBuilder();
                for (String str : strArr) {
                    sb.append(str);
                }
                bytes = sb.toString().getBytes(SjP.b);
            }
            try {
                com.google.protobuf.EQ.byN.QnHx qnHx = com.google.protobuf.EQ.byN.O;
                qnHx.getClass();
                com.google.protobuf.EQ.byN byn = (com.google.protobuf.EQ.byN) qnHx.f(bytes, bytes.length, com.google.protobuf.F1.a);
                try {
                    return g(byn, ykkArr);
                } catch (DescriptorValidationException e) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + byn.S() + "\".", e);
                }
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
            }
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.w.S();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.w.S();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.w;
        }

        public final List<QnHx> l() {
            return Collections.unmodifiableList(Arrays.asList(this.x));
        }

        public final int m() {
            return "proto3".equals(this.w.W()) ? 3 : 2;
        }

        public YKK(String str, QnHx qnHx) throws DescriptorValidationException {
            CQf cQf = new CQf(new YKK[0]);
            this.C = cQf;
            com.google.protobuf.EQ.byN.CQf cQfY = com.google.protobuf.EQ.byN.N.c();
            String str2 = qnHx.x + ".placeholder.proto";
            str2.getClass();
            cQfY.A |= 1;
            cQfY.B = str2;
            cQfY.M();
            str.getClass();
            cQfY.A |= 2;
            cQfY.C = str;
            cQfY.M();
            cQfY.getClass();
            com.google.protobuf.EQ.QnHx qnHx2 = qnHx.w;
            qnHx2.getClass();
            cQfY.R();
            cQfY.G.add(qnHx2);
            cQfY.M();
            com.google.protobuf.EQ.byN bynQ = cQfY.f();
            if (bynQ.isInitialized()) {
                this.w = bynQ;
                this.B = new YKK[0];
                this.x = new QnHx[]{qnHx};
                this.y = Descriptors.e;
                this.z = Descriptors.f;
                this.A = Descriptors.d;
                cQf.a(this, str);
                cQf.b(qnHx);
                return;
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(bynQ);
        }
    }

    public static final class QnHx extends auxFixed {
        public final F1[] A;
        public final NUlFixed[] B;
        public final NUlFixed[] C;
        public final NUlFixed[] D;
        public final byN[] E;
        public final int[] F;
        public final int[] G;
        public final com.google.protobuf.EQ.QnHx w;
        public final String x;
        public final YKK y;
        public final QnHx[] z;

        public QnHx(com.google.protobuf.EQ.QnHx qnHx, YKK ykk, QnHx qnHx2) throws DescriptorValidationException {
            this.w = qnHx;
            this.x = Descriptors.a(ykk, qnHx2, qnHx.T());
            this.y = ykk;
            this.E = qnHx.U() > 0 ? new byN[qnHx.U()] : Descriptors.g;
            int i = 0;
            for (int i2 = 0; i2 < qnHx.U(); i2++) {
                this.E[i2] = new byN(qnHx.G.get(i2), ykk, this, i2);
            }
            this.z = qnHx.D.size() > 0 ? new QnHx[qnHx.D.size()] : Descriptors.c;
            for (int i3 = 0; i3 < qnHx.D.size(); i3++) {
                this.z[i3] = new QnHx(qnHx.D.get(i3), ykk, this);
            }
            this.A = qnHx.E.size() > 0 ? new F1[qnHx.E.size()] : Descriptors.e;
            for (int i4 = 0; i4 < qnHx.E.size(); i4++) {
                this.A[i4] = new F1(qnHx.E.get(i4), ykk, this);
            }
            this.B = qnHx.S() > 0 ? new NUlFixed[qnHx.S()] : Descriptors.d;
            for (int i5 = 0; i5 < qnHx.S(); i5++) {
                this.B[i5] = new NUlFixed(qnHx.B.get(i5), ykk, this, i5, false);
            }
            this.C = qnHx.S() > 0 ? (NUlFixed[]) this.B.clone() : Descriptors.d;
            this.D = qnHx.C.size() > 0 ? new NUlFixed[qnHx.C.size()] : Descriptors.d;
            for (int i6 = 0; i6 < qnHx.C.size(); i6++) {
                this.D[i6] = new NUlFixed(qnHx.C.get(i6), ykk, this, i6, true);
            }
            for (int i7 = 0; i7 < qnHx.U(); i7++) {
                byN byn = this.E[i7];
                byn.C = new NUlFixed[byn.B];
                byn.B = 0;
            }
            for (int i8 = 0; i8 < qnHx.S(); i8++) {
                NUlFixed nUl = this.B[i8];
                byN byn2 = nUl.F;
                if (byn2 != null) {
                    NUlFixed[] nUlArr = byn2.C;
                    int i9 = byn2.B;
                    byn2.B = i9 + 1;
                    nUlArr[i9] = nUl;
                }
            }
            int i10 = 0;
            for (byN byn3 : this.E) {
                if (byn3.g()) {
                    i10++;
                } else if (i10 > 0) {
                    throw new DescriptorValidationException(this, "Synthetic oneofs must come last.");
                }
            }
            int length = this.E.length;
            ykk.C.b(this);
            if (qnHx.F.size() <= 0) {
                int[] iArr = Descriptors.b;
                this.F = iArr;
                this.G = iArr;
                return;
            }
            this.F = new int[qnHx.F.size()];
            this.G = new int[qnHx.F.size()];
            for (com.google.protobuf.EQ.QnHx.F1 f1 : qnHx.F) {
                this.F[i] = f1.A;
                this.G[i] = f1.B;
                i++;
            }
            Arrays.sort(this.F);
            Arrays.sort(this.G);
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final YKK a() {
            return this.y;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String c() {
            return this.x;
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final String d() {
            return this.w.T();
        }

        @Override // com.google.protobuf.Descriptors.auxFixed
        public final mw0t e() {
            return this.w;
        }

        public final void g() throws DescriptorValidationException {
            for (QnHx qnHx : this.z) {
                qnHx.g();
            }
            for (NUlFixed nUl : this.B) {
                NUlFixed.g(nUl);
            }
            NUlFixed[] nUlArr = this.C;
            Arrays.sort(nUlArr);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= nUlArr.length) {
                    for (NUlFixed nUl2 : this.D) {
                        NUlFixed.g(nUl2);
                    }
                    return;
                }
                NUlFixed nUl3 = nUlArr[i];
                NUlFixed nUl4 = nUlArr[i2];
                if (nUl3.x.B == nUl4.x.B) {
                    throw new DescriptorValidationException(nUl4, "Field number " + nUl4.x.B + " has already been used in \"" + nUl4.D.x + "\" by field \"" + nUl3.d() + "\".");
                }
                i = i2;
            }
        }

        public final NUlFixed l(String str) {
            auxFixed auxVarC = this.y.C.c(this.x + '.' + str, 3);
            if (auxVarC instanceof NUlFixed) {
                return (NUlFixed) auxVarC;
            }
            return null;
        }

        public final NUlFixed m(int i) {
            NUlFixed[] nUlArr = this.C;
            int length = nUlArr.length;
            NUlFixed.QnHx qnHx = NUlFixed.I;
            Logger logger = Descriptors.a;
            NUlFixed.QnHx qnHx2 = NUlFixed.I;
            int i2 = length - 1;
            int i3 = 0;
            while (i3 <= i2) {
                int i4 = (i3 + i2) / 2;
                NUlFixed nUl = nUlArr[i4];
                int iA = qnHx2.a(nUl);
                if (i < iA) {
                    i2 = i4 - 1;
                } else {
                    if (i <= iA) {
                        return nUl;
                    }
                    i3 = i4 + 1;
                }
            }
            return null;
        }

        public final List<NUlFixed> n() {
            return Collections.unmodifiableList(Arrays.asList(this.B));
        }

        public final List<QnHx> o() {
            return Collections.unmodifiableList(Arrays.asList(this.z));
        }

        public final List<byN> p() {
            return Collections.unmodifiableList(Arrays.asList(this.E));
        }

        public final com.google.protobuf.EQ.FJCM q() {
            return this.w.V();
        }

        public QnHx(String str) {
            String strSubstring;
            String strSubstring2;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring2 = str.substring(iLastIndexOf + 1);
                strSubstring = str.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
                strSubstring2 = str;
            }
            com.google.protobuf.EQ.QnHx.CQf cQfX = com.google.protobuf.EQ.QnHx.L.c();
            strSubstring2.getClass();
            cQfX.A |= 1;
            cQfX.B = strSubstring2;
            cQfX.M();
            com.google.protobuf.EQ.QnHx.F1.CQf cQfU = com.google.protobuf.EQ.QnHx.F1.E.c();
            cQfU.A |= 1;
            cQfU.B = 1;
            cQfU.M();
            cQfU.A |= 2;
            cQfU.C = 536870912;
            cQfU.M();
            com.google.protobuf.EQ.QnHx.F1 f1Q = cQfU.f();
            if (f1Q.isInitialized()) {
                cQfX.getClass();
                cQfX.R();
                cQfX.G.add(f1Q);
                cQfX.M();
                com.google.protobuf.EQ.QnHx qnHxQ = cQfX.f();
                if (qnHxQ.isInitialized()) {
                    this.w = qnHxQ;
                    this.x = str;
                    this.z = Descriptors.c;
                    this.A = Descriptors.e;
                    NUlFixed[] nUlArr = Descriptors.d;
                    this.B = nUlArr;
                    this.C = nUlArr;
                    this.D = nUlArr;
                    this.E = Descriptors.g;
                    this.y = new YKK(strSubstring, this);
                    this.F = new int[]{1};
                    this.G = new int[]{536870912};
                    return;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(qnHxQ);
            }
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1Q);
        }
    }
}
