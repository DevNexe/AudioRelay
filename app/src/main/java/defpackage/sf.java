package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sf extends df implements tg2<ff>, ff {
    public uy2<dl3, ? extends ms1> A;
    public uy2<dl3, ? extends ms1> B;
    public qf z;

    @if0(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {214, 223, 230}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public uy2 A;
        public uy2 B;
        public int C;
        public /* synthetic */ Object D;
        public final /* synthetic */ iy1 F;
        public final /* synthetic */ dl3 G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(iy1 iy1Var, dl3 dl3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.F = iy1Var;
            this.G = dl3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = sf.this.new QnHx(this.F, this.G, z80Var);
            qnHx.D = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00ca A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:52:0x00c6, B:54:0x00ca), top: B:87:0x002b }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:76:0x0102  */
        /* JADX WARN: Code duplicated, block: B:78:0x0106  */
        /* JADX WARN: Code duplicated, block: B:83:0x0110  */
        /* JADX WARN: Code duplicated, block: B:85:0x0114  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, uy2] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7, types: [uy2] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, uy2, uy2<dl3, ? extends ms1>] */
        /* JADX WARN: Type inference failed for: r9v5 */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            ?? uy2Var;
            uy2<dl3, ? extends ms1> uy2Var2;
            uy2<dl3, ? extends ms1> uy2Var3;
            iy1 iy1Var;
            ?? r3;
            uy2<dl3, ? extends ms1> uy2Var4;
            ?? r0;
            uy2<dl3, ? extends ms1> uy2Var5;
            uy2<dl3, ? extends ms1> uy2Var6;
            ?? r1;
            ?? r4;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.C;
            sf sfVar = sf.this;
            try {
                if (i == 0) {
                    C0239D.H(obj);
                    ua0 ua0Var = (ua0) this.D;
                    iy1 iy1Var2 = sfVar.y;
                    if (iy1Var2 == null || !iy1Var2.q()) {
                        iy1Var2 = null;
                    }
                    if (iy1Var2 == null) {
                        return sd5.a;
                    }
                    iy1 iy1Var3 = this.F;
                    if (!iy1Var3.q()) {
                        return sd5.a;
                    }
                    boolean z = false;
                    dl3 dl3VarN = iy1Var2.N(iy1Var3, false);
                    dl3 dl3VarE = this.G.e(X.a(dl3VarN.a, dl3VarN.b));
                    uy2Var = new uy2(dl3VarE, AY.B(ua0Var.g()));
                    uy2<dl3, ? extends ms1> uy2Var7 = sfVar.A;
                    sfVar.A = uy2Var;
                    if (uy2Var7 != null) {
                        try {
                            dl3 dl3Var = uy2Var7.w;
                            if (dl3Var.a <= dl3VarE.a && dl3Var.b <= dl3VarE.b && dl3Var.c >= dl3VarE.c && dl3Var.d >= dl3VarE.d) {
                                z = true;
                            }
                            if (z) {
                                ms1 ms1Var = (ms1) uy2Var7.x;
                                this.D = iy1Var2;
                                this.A = uy2Var;
                                this.B = uy2Var7;
                                this.C = 2;
                                if (ms1Var.K(this) == va0Var) {
                                    return va0Var;
                                }
                                iy1Var = iy1Var2;
                                r3 = uy2Var;
                                uy2Var4 = uy2Var7;
                                r4 = r3;
                                if (sfVar.B == uy2Var4) {
                                    this.D = r3;
                                    this.A = null;
                                    this.B = null;
                                    this.C = 3;
                                    if (sf.b(sfVar, r3, iy1Var, this) == va0Var) {
                                        return va0Var;
                                    }
                                    r1 = r3;
                                    r4 = r1;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            uy2Var2 = sfVar.B;
                            uy2Var3 = sfVar.A;
                            if (uy2Var2 == uy2Var3) {
                                sfVar.B = null;
                            }
                            if (uy2Var3 == uy2Var) {
                                sfVar.A = null;
                            }
                            throw th;
                        }
                    }
                    this.D = uy2Var;
                    this.C = 1;
                    if (sf.b(sfVar, uy2Var, iy1Var2, this) == va0Var) {
                        return va0Var;
                    }
                    r0 = uy2Var;
                    sd5 sd5Var = sd5.a;
                    uy2Var5 = sfVar.B;
                    uy2Var6 = sfVar.A;
                    if (uy2Var5 == uy2Var6) {
                        sfVar.B = null;
                    }
                    if (uy2Var6 == r0) {
                        sfVar.A = null;
                    }
                    return sd5Var;
                }
                if (i == 1) {
                    uy2 uy2Var8 = (uy2) this.D;
                    C0239D.H(obj);
                    r0 = uy2Var8;
                    sd5 sd5Var2 = sd5.a;
                    uy2Var5 = sfVar.B;
                    uy2Var6 = sfVar.A;
                    if (uy2Var5 == uy2Var6) {
                        sfVar.B = null;
                    }
                    if (uy2Var6 == r0) {
                        sfVar.A = null;
                    }
                    return sd5Var2;
                }
                if (i == 2) {
                    uy2Var4 = this.B;
                    r3 = this.A;
                    iy1Var = (iy1) this.D;
                    try {
                        C0239D.H(obj);
                        r3 = r3;
                        r4 = r3;
                        if (sfVar.B == uy2Var4) {
                            this.D = r3;
                            this.A = null;
                            this.B = null;
                            this.C = 3;
                            if (sf.b(sfVar, r3, iy1Var, this) == va0Var) {
                                return va0Var;
                            }
                            r1 = r3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        uy2Var = r3;
                        uy2Var2 = sfVar.B;
                        uy2Var3 = sfVar.A;
                        if (uy2Var2 == uy2Var3) {
                            sfVar.B = null;
                        }
                        if (uy2Var3 == uy2Var) {
                            sfVar.A = null;
                        }
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uy2 uy2Var9 = (uy2) this.D;
                    C0239D.H(obj);
                    r1 = uy2Var9;
                }
                r4 = r1;
                uy2<dl3, ? extends ms1> uy2Var10 = sfVar.B;
                uy2<dl3, ? extends ms1> uy2Var11 = sfVar.A;
                if (uy2Var10 == uy2Var11) {
                    sfVar.B = null;
                }
                if (uy2Var11 == r4) {
                    sfVar.A = null;
                }
                return sd5.a;
            } catch (Throwable th3) {
                th = th3;
                uy2Var = va0Var;
            }
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public sf(WFia wFia) {
        super(wFia);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(sf sfVar, uy2 uy2Var, iy1 iy1Var, z80 z80Var) {
        sfVar.B = uy2Var;
        dl3 dl3Var = (dl3) uy2Var.w;
        qf qfVar = sfVar.z;
        if (qfVar != null) {
            Object objR = fp1.R(new uf(sfVar, qfVar.b(dl3Var), iy1Var, dl3Var, null), z80Var);
            return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
        }
        ur1.e("responder");
        throw null;
    }

    @Override // defpackage.ff
    public final Object a(dl3 dl3Var, iy1 iy1Var, z80<? super sd5> z80Var) {
        Object objR = fp1.R(new QnHx(iy1Var, dl3Var, null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }

    @Override // defpackage.tg2
    public final mg3<ff> getKey() {
        return ef.a;
    }

    @Override // defpackage.tg2
    public final ff getValue() {
        return this;
    }
}
