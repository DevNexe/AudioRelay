package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface o74 {

    public static final class QnHx {
        public static final C0176QnHx a;
        public static final NUlFixed b;
        public static final CQf c;

        public static final class CQf implements o74 {
            public static int b(o55 o55Var, int i, int i2, int i3, boolean z, boolean z2) {
                long jN = o55Var.n(i);
                int iJ = (int) (jN >> 32);
                if (o55Var.f(iJ) != i2) {
                    iJ = o55Var.j(i2);
                }
                int iC = o55Var.f(s55.c(jN)) == i2 ? s55.c(jN) : o55Var.e(i2, false);
                if (iJ == i3) {
                    return iC;
                }
                if (iC == i3) {
                    return iJ;
                }
                int i4 = (iJ + iC) / 2;
                if (z ^ z2) {
                    if (i <= i4) {
                        return iJ;
                    }
                } else if (i < i4) {
                    return iJ;
                }
                return iC;
            }

            public static int c(o55 o55Var, int i, int i2, int i3, int i4, boolean z, boolean z2) {
                if (i == i2) {
                    return i3;
                }
                int iF = o55Var.f(i);
                if (iF != o55Var.f(i3)) {
                    return b(o55Var, i, iF, i4, z, z2);
                }
                if (!(i2 == -1 || (i != i2 && (!(z ^ z2) ? i <= i2 : i >= i2)))) {
                    return i;
                }
                long jN = o55Var.n(i3);
                return !(i3 == ((int) (jN >> 32)) || i3 == s55.c(jN)) ? i : b(o55Var, i, iF, i4, z, z2);
            }

            @Override // defpackage.o74
            public final long a(o55 o55Var, long j, int i, boolean z, s55 s55Var) {
                int iC;
                int iC2;
                if (s55Var == null) {
                    return QnHx.a(o55Var, j, new NUlFixed.C0175QnHx(o55Var));
                }
                boolean zB = s55.b(j);
                long j2 = s55Var.a;
                if (zB) {
                    return X.r((int) (j >> 32), mv4.B(o55Var.a.a), z, s55.f(j2));
                }
                if (z) {
                    iC2 = c(o55Var, (int) (j >> 32), i, (int) (j2 >> 32), s55.c(j), true, s55.f(j));
                    iC = s55.c(j);
                } else {
                    int i2 = (int) (j >> 32);
                    iC = c(o55Var, s55.c(j), i, s55.c(j2), i2, false, s55.f(j));
                    iC2 = i2;
                }
                return Cz.a(iC2, iC);
            }
        }

        public static final class F1 implements o74 {
            @Override // defpackage.o74
            public final long a(o55 o55Var, long j, int i, boolean z, s55 s55Var) {
                return j;
            }
        }

        public static final class LPt8Fixed implements o74 {

            /* JADX INFO: renamed from: o74$QnHx$LPt8$QnHx, reason: collision with other inner class name */
            public /* synthetic */ class C0174QnHx extends l91 implements j81<Integer, s55> {
                public C0174QnHx(Z7jl z7jl) {
                    super(1, z7jl, su4.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
                }

                @Override // defpackage.j81
                public final s55 invoke(Integer num) {
                    int iIntValue = num.intValue();
                    CharSequence charSequence = (CharSequence) this.x;
                    int i = iIntValue - 1;
                    while (true) {
                        if (i <= 0) {
                            i = 0;
                            break;
                        }
                        int i2 = i - 1;
                        if (charSequence.charAt(i2) == '\n') {
                            break;
                        }
                        i = i2;
                    }
                    int length = iIntValue + 1;
                    int length2 = charSequence.length();
                    while (length < length2) {
                        if (charSequence.charAt(length) == '\n') {
                            return new s55(Cz.a(i, length));
                        }
                        length++;
                    }
                    length = charSequence.length();
                    return new s55(Cz.a(i, length));
                }
            }

            @Override // defpackage.o74
            public final long a(o55 o55Var, long j, int i, boolean z, s55 s55Var) {
                return QnHx.a(o55Var, j, new C0174QnHx(o55Var.a.a));
            }
        }

        public static final class NUlFixed implements o74 {

            /* JADX INFO: renamed from: o74$QnHx$NUl$QnHx, reason: collision with other inner class name */
            public /* synthetic */ class C0175QnHx extends l91 implements j81<Integer, s55> {
                public C0175QnHx(Object obj) {
                    super(1, obj, o55.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
                }

                @Override // defpackage.j81
                public final s55 invoke(Integer num) {
                    return new s55(((o55) this.x).n(num.intValue()));
                }
            }

            @Override // defpackage.o74
            public final long a(o55 o55Var, long j, int i, boolean z, s55 s55Var) {
                return QnHx.a(o55Var, j, new C0175QnHx(o55Var));
            }
        }

        /* JADX INFO: renamed from: o74$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0176QnHx implements o74 {
            @Override // defpackage.o74
            public final long a(o55 o55Var, long j, int i, boolean z, s55 s55Var) {
                if (s55.b(j)) {
                    return X.r((int) (j >> 32), mv4.B(o55Var.a.a), z, s55Var != null ? s55.f(s55Var.a) : false);
                }
                return j;
            }
        }

        static {
            new F1();
            a = new C0176QnHx();
            b = new NUlFixed();
            new LPt8Fixed();
            c = new CQf();
        }

        public static final long a(o55 o55Var, long j, j81 j81Var) {
            m55 m55Var = o55Var.a;
            if (m55Var.a.length() == 0) {
                return s55.b;
            }
            int iB = mv4.B(m55Var.a);
            int i = s55.c;
            long j2 = ((s55) j81Var.invoke(Integer.valueOf(AY.o((int) (j >> 32), 0, iB)))).a;
            long j3 = ((s55) j81Var.invoke(Integer.valueOf(AY.o(s55.c(j), 0, iB)))).a;
            return Cz.a(s55.f(j) ? s55.c(j2) : (int) (j2 >> 32), s55.f(j) ? (int) (j3 >> 32) : s55.c(j3));
        }
    }

    long a(o55 o55Var, long j, int i, boolean z, s55 s55Var);
}
