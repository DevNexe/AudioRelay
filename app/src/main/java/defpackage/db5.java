package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class db5<K, V> {
    public static final db5 e = new db5(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final su4 c;
    public Object[] d;

    public static final class QnHx<K, V> {
        public db5<K, V> a;
        public final int b;

        public QnHx(db5<K, V> db5Var, int i) {
            this.a = db5Var;
            this.b = i;
        }
    }

    public db5() {
        throw null;
    }

    public db5(int i, int i2, Object[] objArr, su4 su4Var) {
        this.a = i;
        this.b = i2;
        this.c = su4Var;
        this.d = objArr;
    }

    public static db5 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, su4 su4Var) {
        if (i3 > 30) {
            return new db5(0, 0, new Object[]{obj, obj2, obj3, obj4}, su4Var);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new db5(0, 1 << i4, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, su4Var)}, su4Var);
        }
        Object[] objArr = new Object[4];
        if (i4 < i5) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new db5((1 << i5) | (1 << i4), 0, objArr, su4Var);
    }

    public final Object[] a(int i, int i2, int i3, K k, V v, int i4, su4 su4Var) {
        Object obj = this.d[i];
        db5 db5VarJ = j(obj != null ? obj.hashCode() : 0, obj, x(i), i3, k, v, i4 + 5, su4Var);
        int iT = t(i2) + 1;
        Object[] objArr = this.d;
        int i5 = iT - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        NPO.a0(objArr, objArr2, 0, 0, i, 6);
        int i6 = i + 2;
        System.arraycopy(objArr, i6, objArr2, i, iT - i6);
        objArr2[i5] = db5VarJ;
        System.arraycopy(objArr, iT, objArr2, i5 + 1, objArr.length - iT);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(K k) {
        np1 np1VarM = AY.M(AY.V(0, this.d.length), 2);
        int i = np1VarM.w;
        int i2 = np1VarM.x;
        int i3 = np1VarM.y;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!ur1.a(k, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            return ur1.a(obj, this.d[f(i3)]);
        }
        if (!i(i3)) {
            return false;
        }
        db5<K, V> db5VarS = s(t(i3));
        return i2 == 30 ? db5VarS.c(obj) : db5VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(db5<K, V> db5Var) {
        if (this == db5Var) {
            return true;
        }
        if (this.b != db5Var.b || this.a != db5Var.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != db5Var.d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int iF = f(i3);
            if (ur1.a(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(i3)) {
            return null;
        }
        db5<K, V> db5VarS = s(t(i3));
        if (i2 != 30) {
            return db5VarS.g(i, i2 + 5, obj);
        }
        np1 np1VarM = AY.M(AY.V(0, db5VarS.d.length), 2);
        int i4 = np1VarM.w;
        int i5 = np1VarM.x;
        int i6 = np1VarM.y;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return null;
        }
        while (!ur1.a(obj, db5VarS.d[i4])) {
            if (i4 == i5) {
                return null;
            }
            i4 += i6;
        }
        return db5VarS.x(i4);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final db5<K, V> k(int i, a13<K, V> a13Var) {
        a13Var.b(a13Var.B - 1);
        a13Var.z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != a13Var.x) {
            return new db5<>(0, 0, X.g(i, objArr), a13Var.x);
        }
        this.d = X.g(i, objArr);
        return this;
    }

    public final db5<K, V> l(int i, K k, V v, int i2, a13<K, V> a13Var) {
        db5<K, V> db5VarL;
        int i3 = 1 << ((i >> i2) & 31);
        boolean zH = h(i3);
        su4 su4Var = this.c;
        if (zH) {
            int iF = f(i3);
            if (!ur1.a(k, this.d[iF])) {
                a13Var.b(a13Var.B + 1);
                su4 su4Var2 = a13Var.x;
                if (su4Var != su4Var2) {
                    return new db5<>(this.a ^ i3, this.b | i3, a(iF, i3, i, k, v, i2, su4Var2), su4Var2);
                }
                this.d = a(iF, i3, i, k, v, i2, su4Var2);
                this.a ^= i3;
                this.b |= i3;
                return this;
            }
            a13Var.z = x(iF);
            if (x(iF) == v) {
                return this;
            }
            if (su4Var == a13Var.x) {
                this.d[iF + 1] = v;
                return this;
            }
            a13Var.A++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = v;
            return new db5<>(this.a, this.b, objArrCopyOf, a13Var.x);
        }
        if (!i(i3)) {
            a13Var.b(a13Var.B + 1);
            su4 su4Var3 = a13Var.x;
            int iF2 = f(i3);
            if (su4Var != su4Var3) {
                return new db5<>(this.a | i3, this.b, X.e(this.d, iF2, k, v), su4Var3);
            }
            this.d = X.e(this.d, iF2, k, v);
            this.a |= i3;
            return this;
        }
        int iT = t(i3);
        db5<K, V> db5VarS = s(iT);
        if (i2 == 30) {
            np1 np1VarM = AY.M(AY.V(0, db5VarS.d.length), 2);
            int i4 = np1VarM.w;
            int i5 = np1VarM.x;
            int i6 = np1VarM.y;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                a13Var.b(a13Var.B + 1);
                db5VarL = new db5<>(0, 0, X.e(db5VarS.d, 0, k, v), a13Var.x);
            } else {
                while (true) {
                    if (!ur1.a(k, db5VarS.d[i4])) {
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    } else {
                        a13Var.z = db5VarS.x(i4);
                        if (db5VarS.c == a13Var.x) {
                            db5VarS.d[i4 + 1] = v;
                            db5VarL = db5VarS;
                        } else {
                            a13Var.A++;
                            Object[] objArr2 = db5VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            objArrCopyOf2[i4 + 1] = v;
                            db5VarL = new db5<>(0, 0, objArrCopyOf2, a13Var.x);
                        }
                    }
                }
                a13Var.b(a13Var.B + 1);
                db5VarL = new db5<>(0, 0, X.e(db5VarS.d, 0, k, v), a13Var.x);
            }
        } else {
            db5VarL = db5VarS.l(i, k, v, i2 + 5, a13Var);
        }
        return db5VarS == db5VarL ? this : r(iT, db5VarL, a13Var.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [db5, db5<K, V>] */
    /* JADX WARN: Type inference failed for: r4v17, types: [db5] */
    /* JADX WARN: Type inference failed for: r4v21, types: [db5] */
    /* JADX WARN: Type inference failed for: r4v22, types: [db5] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25, types: [db5] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type db5<K, V> to ?? for r28v0 'this'  ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public final defpackage.db5<K, V> m(defpackage.db5<K, V> r29, int r30, defpackage.gj0 r31, defpackage.a13<K, V> r32) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db5.m(db5, int, gj0, a13):db5");
    }

    public final db5<K, V> n(int i, K k, int i2, a13<K, V> a13Var) {
        db5<K, V> db5VarN;
        db5<K, V> db5Var;
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int iF = f(i3);
            return ur1.a(k, this.d[iF]) ? p(iF, i3, a13Var) : this;
        }
        if (!i(i3)) {
            return this;
        }
        int iT = t(i3);
        db5<K, V> db5VarS = s(iT);
        if (i2 == 30) {
            np1 np1VarM = AY.M(AY.V(0, db5VarS.d.length), 2);
            int i4 = np1VarM.w;
            int i5 = np1VarM.x;
            int i6 = np1VarM.y;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (ur1.a(k, db5VarS.d[i4])) {
                        db5VarN = db5VarS.k(i4, a13Var);
                    } else if (i4 != i5) {
                        i4 += i6;
                    }
                }
            }
            db5Var = db5VarS;
            return q(db5VarS, db5Var, iT, i3, a13Var.x);
        }
        db5VarN = db5VarS.n(i, k, i2 + 5, a13Var);
        db5Var = db5VarN;
        return q(db5VarS, db5Var, iT, i3, a13Var.x);
    }

    public final db5<K, V> o(int i, K k, V v, int i2, a13<K, V> a13Var) {
        db5<K, V> db5VarO;
        db5<K, V> db5Var;
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int iF = f(i3);
            return (ur1.a(k, this.d[iF]) && ur1.a(v, x(iF))) ? p(iF, i3, a13Var) : this;
        }
        if (!i(i3)) {
            return this;
        }
        int iT = t(i3);
        db5<K, V> db5VarS = s(iT);
        if (i2 == 30) {
            np1 np1VarM = AY.M(AY.V(0, db5VarS.d.length), 2);
            int i4 = np1VarM.w;
            int i5 = np1VarM.x;
            int i6 = np1VarM.y;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (ur1.a(k, db5VarS.d[i4]) && ur1.a(v, db5VarS.x(i4))) {
                        db5VarO = db5VarS.k(i4, a13Var);
                    } else if (i4 != i5) {
                        i4 += i6;
                    }
                }
            }
            db5Var = db5VarS;
            return q(db5VarS, db5Var, iT, i3, a13Var.x);
        }
        db5VarO = db5VarS.o(i, k, v, i2 + 5, a13Var);
        db5Var = db5VarO;
        return q(db5VarS, db5Var, iT, i3, a13Var.x);
    }

    public final db5<K, V> p(int i, int i2, a13<K, V> a13Var) {
        a13Var.b(a13Var.B - 1);
        a13Var.z = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != a13Var.x) {
            return new db5<>(i2 ^ this.a, this.b, X.g(i, objArr), a13Var.x);
        }
        this.d = X.g(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final db5<K, V> q(db5<K, V> db5Var, db5<K, V> db5Var2, int i, int i2, su4 su4Var) {
        su4 su4Var2 = this.c;
        if (db5Var2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (su4Var2 != su4Var) {
                return new db5<>(this.a, i2 ^ this.b, X.h(i, objArr), su4Var);
            }
            this.d = X.h(i, objArr);
            this.b ^= i2;
        } else if (su4Var2 == su4Var || db5Var != db5Var2) {
            return r(i, db5Var2, su4Var);
        }
        return this;
    }

    public final db5<K, V> r(int i, db5<K, V> db5Var, su4 su4Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && db5Var.d.length == 2 && db5Var.b == 0) {
            db5Var.a = this.b;
            return db5Var;
        }
        if (this.c == su4Var) {
            objArr[i] = db5Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = db5Var;
        return new db5<>(this.a, this.b, objArrCopyOf, su4Var);
    }

    public final db5<K, V> s(int i) {
        Object obj = this.d[i];
        if (obj != null) {
            return (db5) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final QnHx u(int i, int i2, Object obj, x32 x32Var) {
        QnHx qnHxU;
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int iF = f(i3);
            if (!ur1.a(obj, this.d[iF])) {
                return new QnHx(new db5(this.a ^ i3, this.b | i3, a(iF, i3, i, obj, x32Var, i2, null), null), 1);
            }
            if (x(iF) == x32Var) {
                return null;
            }
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = x32Var;
            return new QnHx(new db5(this.a, this.b, objArrCopyOf, null), 0);
        }
        if (!i(i3)) {
            return new QnHx(new db5(this.a | i3, this.b, X.e(this.d, f(i3), obj, x32Var), null), 1);
        }
        int iT = t(i3);
        db5<K, V> db5VarS = s(iT);
        if (i2 == 30) {
            np1 np1VarM = AY.M(AY.V(0, db5VarS.d.length), 2);
            int i4 = np1VarM.w;
            int i5 = np1VarM.x;
            int i6 = np1VarM.y;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!ur1.a(obj, db5VarS.d[i4])) {
                        if (i4 == i5) {
                            qnHxU = new QnHx(new db5(0, 0, X.e(db5VarS.d, 0, obj, x32Var), null), 1);
                            break;
                        }
                        i4 += i6;
                    } else {
                        if (x32Var != db5VarS.x(i4)) {
                            Object[] objArr2 = db5VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            objArrCopyOf2[i4 + 1] = x32Var;
                            qnHxU = new QnHx(new db5(0, 0, objArrCopyOf2, null), 0);
                            break;
                        }
                        qnHxU = null;
                        break;
                    }
                }
            } else {
                qnHxU = new QnHx(new db5(0, 0, X.e(db5VarS.d, 0, obj, x32Var), null), 1);
                break;
            }
            if (qnHxU == null) {
                return null;
            }
        } else {
            qnHxU = db5VarS.u(i, i2 + 5, obj, x32Var);
            if (qnHxU == null) {
                return null;
            }
        }
        qnHxU.a = w(iT, i3, qnHxU.a);
        return qnHxU;
    }

    public final db5 v(int i, int i2, Object obj) {
        db5<K, V> db5VarV;
        int i3 = 1 << ((i >> i2) & 31);
        if (h(i3)) {
            int iF = f(i3);
            if (!ur1.a(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length == 2) {
                return null;
            }
            return new db5(this.a ^ i3, this.b, X.g(iF, objArr), null);
        }
        if (!i(i3)) {
            return this;
        }
        int iT = t(i3);
        db5<K, V> db5VarS = s(iT);
        if (i2 == 30) {
            np1 np1VarM = AY.M(AY.V(0, db5VarS.d.length), 2);
            int i4 = np1VarM.w;
            int i5 = np1VarM.x;
            int i6 = np1VarM.y;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!ur1.a(obj, db5VarS.d[i4])) {
                        if (i4 == i5) {
                            db5VarV = db5VarS;
                            break;
                        }
                        i4 += i6;
                    } else {
                        Object[] objArr2 = db5VarS.d;
                        if (objArr2.length != 2) {
                            db5VarV = new db5<>(0, 0, X.g(i4, objArr2), null);
                            break;
                        }
                        db5VarV = null;
                        break;
                    }
                }
            } else {
                db5VarV = db5VarS;
                break;
            }
        } else {
            db5VarV = db5VarS.v(i, i2 + 5, obj);
        }
        if (db5VarV != null) {
            return db5VarS != db5VarV ? w(iT, i3, db5VarV) : this;
        }
        Object[] objArr3 = this.d;
        if (objArr3.length == 1) {
            return null;
        }
        return new db5(this.a, i3 ^ this.b, X.h(iT, objArr3), null);
    }

    public final db5<K, V> w(int i, int i2, db5<K, V> db5Var) {
        Object[] objArr = db5Var.d;
        if (objArr.length != 2 || db5Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = db5Var;
            return new db5<>(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            db5Var.a = this.b;
            return db5Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        int i3 = i + 1;
        System.arraycopy(objArrCopyOf2, i3, objArrCopyOf2, i + 2, objArr3.length - i3);
        System.arraycopy(objArrCopyOf2, iF, objArrCopyOf2, iF + 2, i - iF);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new db5<>(this.a ^ i2, i2 ^ this.b, objArrCopyOf2, null);
    }

    public final V x(int i) {
        return (V) this.d[i + 1];
    }
}
