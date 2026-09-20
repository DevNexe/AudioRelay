package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 {
    public final ui2<QnHx<?, ?>> a = new ui2<>(new QnHx[16]);
    public final kz2 b = ps0.R(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final kz2 d = ps0.R(Boolean.TRUE);

    @if0(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {147, 169}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public gl3 A;
        public int B;
        public /* synthetic */ Object C;

        /* JADX INFO: renamed from: bk1$CQf$CQf, reason: collision with other inner class name */
        public static final class C0059CQf extends cx1 implements h81<Float> {
            public final /* synthetic */ ua0 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0059CQf(ua0 ua0Var) {
                super(0);
                this.w = ua0Var;
            }

            @Override // defpackage.h81
            public final Float invoke() {
                return Float.valueOf(kx4.e(this.w.g()));
            }
        }

        @if0(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        public static final class F1 extends px4 implements x81<Float, z80<? super Boolean>, Object> {
            public /* synthetic */ float A;

            public F1(z80<? super F1> z80Var) {
                super(2, z80Var);
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                F1 f1 = new F1(z80Var);
                f1.A = ((Number) obj).floatValue();
                return f1;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                C0239D.H(obj);
                return Boolean.valueOf(this.A > 0.0f);
            }

            @Override // defpackage.x81
            public final Object invoke(Float f, z80<? super Boolean> z80Var) {
                return ((F1) a(Float.valueOf(f.floatValue()), z80Var)).i(sd5.a);
            }
        }

        public static final class QnHx extends cx1 implements j81<Long, sd5> {
            public final /* synthetic */ bk1 w;
            public final /* synthetic */ gl3 x;
            public final /* synthetic */ ua0 y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(bk1 bk1Var, gl3 gl3Var, ua0 ua0Var) {
                super(1);
                this.w = bk1Var;
                this.x = gl3Var;
                this.y = ua0Var;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0031  */
            /* JADX WARN: Code duplicated, block: B:9:0x002b  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.j81
            public final sd5 invoke(Long l) {
                int i;
                QnHx<?, ?>[] qnHxArr;
                int i2;
                boolean z;
                long jLongValue = l.longValue();
                bk1 bk1Var = this.w;
                long j = bk1Var.c;
                int i3 = 0;
                ui2<QnHx<?, ?>> ui2Var = bk1Var.a;
                ua0 ua0Var = this.y;
                gl3 gl3Var = this.x;
                if (j == Long.MIN_VALUE) {
                    bk1Var.c = jLongValue;
                    i = ui2Var.y;
                    if (i > 0) {
                        qnHxArr = ui2Var.w;
                        i2 = 0;
                        do {
                            qnHxArr[i2].D = true;
                            i2++;
                        } while (i2 < i);
                    }
                    gl3Var.w = kx4.e(ua0Var.g());
                } else {
                    if (!(gl3Var.w == kx4.e(ua0Var.g()))) {
                        bk1Var.c = jLongValue;
                        i = ui2Var.y;
                        if (i > 0) {
                            qnHxArr = ui2Var.w;
                            i2 = 0;
                            do {
                                qnHxArr[i2].D = true;
                                i2++;
                            } while (i2 < i);
                        }
                        gl3Var.w = kx4.e(ua0Var.g());
                    }
                }
                float f = gl3Var.w;
                if (f == 0.0f) {
                    int i4 = ui2Var.y;
                    if (i4 > 0) {
                        QnHx<?, ?>[] qnHxArr2 = ui2Var.w;
                        do {
                            QnHx<?, ?> qnHx = qnHxArr2[i3];
                            qnHx.A.setValue(qnHx.B.d);
                            qnHx.D = true;
                            i3++;
                        } while (i3 < i4);
                    }
                } else {
                    long j2 = (long) ((jLongValue - bk1Var.c) / f);
                    int i5 = ui2Var.y;
                    if (i5 > 0) {
                        QnHx<?, ?>[] qnHxArr3 = ui2Var.w;
                        int i6 = 0;
                        z = true;
                        do {
                            QnHx<?, ?> qnHx2 = qnHxArr3[i6];
                            if (!qnHx2.C) {
                                bk1.this.b.setValue(Boolean.FALSE);
                                if (qnHx2.D) {
                                    qnHx2.D = false;
                                    qnHx2.E = j2;
                                }
                                long j3 = j2 - qnHx2.E;
                                qnHx2.A.setValue(qnHx2.B.f(j3));
                                HZD4 hzd4 = qnHx2.B;
                                hzd4.getClass();
                                qnHx2.C = iZUl.a(hzd4, j3);
                            }
                            if (!qnHx2.C) {
                                z = false;
                            }
                            i6++;
                        } while (i6 < i5);
                    } else {
                        z = true;
                    }
                    bk1Var.d.setValue(Boolean.valueOf(!z));
                }
                return sd5.a;
            }
        }

        public CQf(z80<? super CQf> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            CQf cQf = bk1.this.new CQf(z80Var);
            cQf.C = obj;
            return cQf;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0056  */
        /* JADX WARN: Code duplicated, block: B:18:0x0058  */
        /* JADX WARN: Code duplicated, block: B:20:0x005b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0076 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0074 -> B:12:0x003b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x004e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r9) {
            /*
                r8 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r8.B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                gl3 r1 = r8.A
                java.lang.Object r4 = r8.C
                ua0 r4 = (defpackage.ua0) r4
                defpackage.C0239D.H(r9)
                goto L3a
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                gl3 r1 = r8.A
                java.lang.Object r4 = r8.C
                ua0 r4 = (defpackage.ua0) r4
                defpackage.C0239D.H(r9)
                r9 = r8
                goto L4f
            L29:
                defpackage.C0239D.H(r9)
                java.lang.Object r9 = r8.C
                r4 = r9
                ua0 r4 = (defpackage.ua0) r4
                gl3 r1 = new gl3
                r1.<init>()
                r9 = 1065353216(0x3f800000, float:1.0)
                r1.w = r9
            L3a:
                r9 = r8
            L3b:
                bk1$CQf$QnHx r5 = new bk1$CQf$QnHx
                bk1 r6 = defpackage.bk1.this
                r5.<init>(r6, r1, r4)
                r9.C = r4
                r9.A = r1
                r9.B = r3
                java.lang.Object r5 = defpackage.bx0.h(r5, r9)
                if (r5 != r0) goto L4f
                return r0
            L4f:
                float r5 = r1.w
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L58
                r5 = 1
                goto L59
            L58:
                r5 = 0
            L59:
                if (r5 == 0) goto L3b
                bk1$CQf$CQf r5 = new bk1$CQf$CQf
                r5.<init>(r4)
                d24 r5 = defpackage.ps0.h0(r5)
                bk1$CQf$F1 r6 = new bk1$CQf$F1
                r7 = 0
                r6.<init>(r7)
                r9.C = r4
                r9.A = r1
                r9.B = r2
                java.lang.Object r5 = defpackage.kd.m(r5, r6, r9)
                if (r5 != r0) goto L3b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bk1.CQf.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i) {
            super(2);
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            bk1.this.a(g30Var, i);
            return sd5.a;
        }
    }

    public final class QnHx<T, V extends z_Mm> implements is4<T> {
        public final kz2 A;
        public t05<T, V> B;
        public boolean C;
        public boolean D;
        public long E;
        public T w;
        public T x;
        public final pb5<T, V> y;
        public Ah<T> z;

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(Number number, Number number2, qb5 qb5Var, Ah ah) {
            this.w = number;
            this.x = number2;
            this.y = qb5Var;
            this.z = ah;
            this.A = ps0.R(number);
            this.B = new t05<>(this.z, qb5Var, this.w, this.x);
        }

        @Override // defpackage.is4
        public final T getValue() {
            return this.A.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-318043801);
        if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
            wq0.d(this, new CQf(null), j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(i);
    }
}
