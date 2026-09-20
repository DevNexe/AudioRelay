package defpackage;

import com.github.mikephil.charting.charts.Chart;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r22 {
    public static final ry4 a = new ry4(NUlFixed.w);

    public static final class CQf extends cx1 implements j81<Integer, sd5> {
        public final /* synthetic */ yf w;
        public final /* synthetic */ String x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(yf yfVar, String str) {
            super(1);
            this.w = yfVar;
            this.x = str;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Integer num) {
            num.intValue();
            a62.a.c("Opening license page…");
            this.w.a(this.x, "license");
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ String w;
        public final /* synthetic */ String x;
        public final /* synthetic */ w55 y;
        public final /* synthetic */ x41 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(String str, String str2, w55 w55Var, x41 x41Var, int i, int i2) {
            super(2);
            this.w = str;
            this.x = str2;
            this.y = w55Var;
            this.z = x41Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            r22.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = i;
            this.y = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            int i2 = this.y;
            r22.b(this.w, g30Var, i, i2);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements h81<List<? extends n22>> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final List<? extends n22> invoke() {
            return wu.Z0(ps0.M(new n22("Accompanist", "https://github.com/google/accompanist", "Apache Software License 2.0", "https://github.com/google/accompanist/blob/main/LICENSE"), new n22("Arrow", "https://github.com/arrow-kt/arrow", "Apache Software License 2.0", "https://github.com/arrow-kt/arrow/blob/main/LICENSE"), new n22("Ballast", "https://github.com/copper-leaf/ballast/", "BSD 3-Clause License", "https://github.com/copper-leaf/ballast/blob/main/LICENSE.md"), new n22("concurrentqueue", "https://github.com/cameron314/concurrentqueue", "BSD 2-Clause License", "https://github.com/cameron314/concurrentqueue/blob/master/LICENSE.md"), new n22("Compose Multiplatform", "https://github.com/JetBrains/compose-jb", "Apache Software License 2.0", "https://github.com/JetBrains/compose-jb/blob/master/LICENSE.txt"), new n22("Clikt", "https://github.com/ajalt/clikt/", "Apache Software License 2.0", "https://github.com/ajalt/clikt/blob/master/LICENSE.txt"), new n22("Kotlin", "https://kotlinlang.org/", "Apache Software License 2.0", "https://github.com/JetBrains/kotlin/blob/master/license/LICENSE.txt"), new n22("kotlinx.coroutines", "https://github.com/Kotlin/kotlinx.coroutines", "Apache Software License 2.0", "https://github.com/Kotlin/kotlinx.coroutines/blob/master/LICENSE.txt"), new n22("kotlin-inject", "https://github.com/evant/kotlin-inject", "Apache Software License 2.0", "https://github.com/evant/kotlin-inject/blob/main/LICENSE"), new n22("Kotlin Multiplatform Markdown Renderer", "https://github.com/mikepenz/multiplatform-markdown-renderer", "Apache Software License 2.0", "https://github.com/mikepenz/multiplatform-markdown-renderer/blob/develop/LICENSE"), new n22("LeakCanary", "https://github.com/square/leakcanary", "Apache Software License 2.0", "https://github.com/square/leakcanary/blob/main/LICENSE.txt"), new n22("Lingver", "https://github.com/YarikSOffice/lingver", "MIT License", "https://github.com/YarikSOffice/lingver/blob/master/LICENSE.md"), new n22("moko resources", "https://github.com/icerockdev/moko-resources", "Apache Software License 2.0", "https://github.com/icerockdev/moko-resources/blob/master/LICENSE.md"), new n22(Chart.LOG_TAG, "https://github.com/PhilJay/MPAndroidChart", "Apache Software License 2.0", "https://github.com/PhilJay/MPAndroidChart/blob/master/LICENSE"), new n22("NAudio", "https://github.com/naudio/NAudio", "MIT license", "https://github.com/naudio/NAudio/blob/master/license.txt"), new n22("Nefarius.Utilities.DeviceManagement", "https://github.com/nefarius/Nefarius.Utilities.DeviceManagement", "MIT license", "https://github.com/nefarius/Nefarius.Utilities.DeviceManagement/blob/master/LICENSE"), new n22("OkHttp", "https://github.com/square/okhttp", "Apache Software License 2.0", "https://github.com/square/okhttp/blob/master/LICENSE.txt"), new n22("Opus", "https://opus-codec.org", "BSD 3-Clause License", "https://opus-codec.org/license/"), new n22("PortAudio", "http://www.portaudio.com/", "PortAudio License", "http://www.portaudio.com/license.html"), new n22("protobuf", "https://developers.google.com/protocol-buffers/", "Protobuf License", "https://github.com/protocolbuffers/protobuf/blob/master/LICENSE"), new n22("rnnoise", "https://gitlab.xiph.org/xiph/rnnoise/", "BSD 3-Clause License", "https://gitlab.xiph.org/xiph/rnnoise/-/blob/master/COPYING"), new n22("RxAndroid", "https://github.com/ReactiveX/RxAndroid", "Apache Software License 2.0", "https://github.com/ReactiveX/RxAndroid/blob/master/LICENSE"), new n22("RxJava", "https://github.com/ReactiveX/RxJava", "Apache Software License 2.0", "https://github.com/ReactiveX/RxJava/blob/master/LICENSE"), new n22("RxJavaExtensions", "https://github.com/akarnokd/RxJavaExtensions", "Apache Software License 2.0", "https://github.com/akarnokd/RxJavaExtensions/blob/master/LICENSE"), new n22("RxKotlin", "https://github.com/ReactiveX/RxKotlin", "Apache Software License 2.0", "https://github.com/ReactiveX/RxKotlin/blob/master/LICENSE"), new n22("RxRelay", "https://github.com/JakeWharton/RxRelay", "Apache Software License 2.0", "https://github.com/JakeWharton/RxRelay/blob/master/LICENSE.txt"), new n22("Sentry SDK for Java", "https://github.com/getsentry/sentry-java", "MIT License", "https://github.com/getsentry/sentry-java/blob/main/LICENSE"), new n22("Sentry SDK for .NET", "https://github.com/getsentry/sentry-dotnet", "MIT License", "https://github.com/getsentry/sentry-dotnet/blob/main/LICENSE"), new n22("SimpleInjector", "https://github.com/simpleinjector/SimpleInjector", "MIT License", "https://github.com/simpleinjector/SimpleInjector/blob/master/LICENSE"), new n22("System.Reactive", "https://github.com/dotnet/reactive", "MIT License", "https://github.com/dotnet/reactive/blob/main/LICENSE"), new n22("tinylog", "https://github.com/tinylog-org/tinylog", "Apache Software License 2.0", "https://github.com/tinylog-org/tinylog/blob/v2.6/license.txt")), new u22());
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ yf w;
        public final /* synthetic */ String x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(yf yfVar, String str) {
            super(0);
            this.w = yfVar;
            this.x = str;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            a62.a.c("Opening license page…");
            this.w.a(this.x, "license");
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3 A[PHI: r2 r4
  0x00c3: PHI (r2v19 int) = (r2v15 int), (r2v14 int), (r2v20 int) binds: [B:62:0x00be, B:57:0x009a, B:58:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r4v12 w55) = (r4v9 w55), (r4v8 w55), (r4v8 w55) binds: [B:62:0x00be, B:57:0x009a, B:58:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x018b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, String str2, w55 w55Var, x41 x41Var, g30 g30Var, int i, int i2) {
        int i3;
        w55 w55Var2;
        x41 x41Var2;
        x41 x41Var3;
        yf yfVarB;
        boolean zI;
        Object objB0;
        Z7jl.QnHx qnHx;
        int iD;
        boolean zI2;
        Object objB1;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1295215174);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                w55Var2 = w55Var;
                int i4 = j30VarQ.I(w55Var2) ? 256 : 128;
                i3 |= i4;
            } else {
                w55Var2 = w55Var;
            }
            i3 |= i4;
        } else {
            w55Var2 = w55Var;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 7168) == 0) {
                x41Var2 = x41Var;
                i3 |= j30VarQ.I(x41Var2) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                j30VarQ.t0();
                try {
                    if ((i & 1) != 0 || j30VarQ.Y()) {
                        if ((i2 & 4) != 0) {
                            w55Var2 = new w55(0L, 0L, null, null, null, 0L, null, null, 0L, 262143);
                            i3 &= -897;
                        }
                        if (i5 != 0) {
                            x41Var3 = x41.z;
                        }
                        j30VarQ.S();
                        e40.CQf cQf = e40.a;
                        j30VarQ.e(-469327510);
                        yfVarB = ag.b(j30VarQ);
                        ag.a(yfVarB, j30VarQ, 0);
                        j30VarQ.R(false);
                        pg2 pg2VarA = y31.a(fTO$.h(pg2.QnHx.w, j30VarQ));
                        j30VarQ.e(511388516);
                        zI = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
                        objB0 = j30VarQ.b0();
                        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                        if (zI || objB0 == c0132QnHx) {
                            objB0 = new QnHx(yfVarB, str2);
                            j30VarQ.F0(objB0);
                        }
                        j30VarQ.R(false);
                        pg2 pg2VarA2 = cw1.a(pg2VarA, new lw1((h81) objB0));
                        j30VarQ.e(-469327184);
                        qnHx = new Z7jl.QnHx();
                        iD = qnHx.d(new rq4(((rv) j30VarQ.E(sv.a)).g(), 0L, x41Var3, (v41) null, (w41) null, (e41) null, (String) null, 0L, (x8) null, (a55) null, (z42) null, 0L, (a25) null, (yi4) null, 16378));
                        qnHx.a.append(str);
                        sd5 sd5Var = sd5.a;
                        qnHx.c(iD);
                        Z7jl z7jlE = qnHx.e();
                        j30VarQ.R(false);
                        j30VarQ.e(511388516);
                        zI2 = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
                        objB1 = j30VarQ.b0();
                        if (zI2 || objB1 == c0132QnHx) {
                            objB1 = new CQf(yfVarB, str2);
                            j30VarQ.F0(objB1);
                        }
                        j30VarQ.R(false);
                        xr.a(z7jlE, pg2VarA2, w55Var2, false, 0, 0, null, (j81) objB1, j30VarQ, i3 & 896, 120);
                    } else {
                        j30VarQ.x();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    qnHx.a.append(str);
                    sd5 sd5Var2 = sd5.a;
                    qnHx.c(iD);
                    Z7jl z7jlE2 = qnHx.e();
                    j30VarQ.R(false);
                    j30VarQ.e(511388516);
                    zI2 = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
                    objB1 = j30VarQ.b0();
                    if (zI2) {
                        objB1 = new CQf(yfVarB, str2);
                        j30VarQ.F0(objB1);
                    } else {
                        objB1 = new CQf(yfVarB, str2);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    xr.a(z7jlE2, pg2VarA2, w55Var2, false, 0, 0, null, (j81) objB1, j30VarQ, i3 & 896, 120);
                } catch (Throwable th) {
                    qnHx.c(iD);
                    throw th;
                }
                x41Var3 = x41Var2;
                j30VarQ.S();
                e40.CQf cQf2 = e40.a;
                j30VarQ.e(-469327510);
                yfVarB = ag.b(j30VarQ);
                ag.a(yfVarB, j30VarQ, 0);
                j30VarQ.R(false);
                pg2 pg2VarA3 = y31.a(fTO$.h(pg2.QnHx.w, j30VarQ));
                j30VarQ.e(511388516);
                zI = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
                objB0 = j30VarQ.b0();
                g30.QnHx.C0132QnHx c0132QnHx2 = g30.QnHx.a;
                if (zI) {
                    objB0 = new QnHx(yfVarB, str2);
                    j30VarQ.F0(objB0);
                } else {
                    objB0 = new QnHx(yfVarB, str2);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                pg2 pg2VarA4 = cw1.a(pg2VarA3, new lw1((h81) objB0));
                j30VarQ.e(-469327184);
                qnHx = new Z7jl.QnHx();
                iD = qnHx.d(new rq4(((rv) j30VarQ.E(sv.a)).g(), 0L, x41Var3, (v41) null, (w41) null, (e41) null, (String) null, 0L, (x8) null, (a55) null, (z42) null, 0L, (a25) null, (yi4) null, 16378));
            } else {
                j30VarQ.x();
                x41Var3 = x41Var2;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new F1(str, str2, w55Var2, x41Var3, i, i2);
        }
        i3 |= 3072;
        x41Var2 = x41Var;
        if ((i3 & 5851) == 1170) {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    w55Var2 = new w55(0L, 0L, null, null, null, 0L, null, null, 0L, 262143);
                    i3 &= -897;
                }
                if (i5 != 0) {
                    x41Var3 = x41.z;
                } else {
                    x41Var3 = x41Var2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    w55Var2 = new w55(0L, 0L, null, null, null, 0L, null, null, 0L, 262143);
                    i3 &= -897;
                }
                if (i5 != 0) {
                    x41Var3 = x41.z;
                } else {
                    x41Var3 = x41Var2;
                }
            }
            j30VarQ.S();
            e40.CQf cQf3 = e40.a;
            j30VarQ.e(-469327510);
            yfVarB = ag.b(j30VarQ);
            ag.a(yfVarB, j30VarQ, 0);
            j30VarQ.R(false);
            pg2 pg2VarA5 = y31.a(fTO$.h(pg2.QnHx.w, j30VarQ));
            j30VarQ.e(511388516);
            zI = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
            objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx3 = g30.QnHx.a;
            if (zI) {
                objB0 = new QnHx(yfVarB, str2);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new QnHx(yfVarB, str2);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2 pg2VarA6 = cw1.a(pg2VarA5, new lw1((h81) objB0));
            j30VarQ.e(-469327184);
            qnHx = new Z7jl.QnHx();
            iD = qnHx.d(new rq4(((rv) j30VarQ.E(sv.a)).g(), 0L, x41Var3, (v41) null, (w41) null, (e41) null, (String) null, 0L, (x8) null, (a55) null, (z42) null, 0L, (a25) null, (yi4) null, 16378));
            qnHx.a.append(str);
            sd5 sd5Var3 = sd5.a;
            qnHx.c(iD);
            Z7jl z7jlE3 = qnHx.e();
            j30VarQ.R(false);
            j30VarQ.e(511388516);
            zI2 = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
            objB1 = j30VarQ.b0();
            if (zI2) {
                objB1 = new CQf(yfVarB, str2);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new CQf(yfVarB, str2);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            xr.a(z7jlE3, pg2VarA6, w55Var2, false, 0, 0, null, (j81) objB1, j30VarQ, i3 & 896, 120);
        } else {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    w55Var2 = new w55(0L, 0L, null, null, null, 0L, null, null, 0L, 262143);
                    i3 &= -897;
                }
                if (i5 != 0) {
                    x41Var3 = x41.z;
                } else {
                    x41Var3 = x41Var2;
                }
            } else {
                if ((i2 & 4) != 0) {
                    w55Var2 = new w55(0L, 0L, null, null, null, 0L, null, null, 0L, 262143);
                    i3 &= -897;
                }
                if (i5 != 0) {
                    x41Var3 = x41.z;
                } else {
                    x41Var3 = x41Var2;
                }
            }
            j30VarQ.S();
            e40.CQf cQf4 = e40.a;
            j30VarQ.e(-469327510);
            yfVarB = ag.b(j30VarQ);
            ag.a(yfVarB, j30VarQ, 0);
            j30VarQ.R(false);
            pg2 pg2VarA7 = y31.a(fTO$.h(pg2.QnHx.w, j30VarQ));
            j30VarQ.e(511388516);
            zI = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
            objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx4 = g30.QnHx.a;
            if (zI) {
                objB0 = new QnHx(yfVarB, str2);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new QnHx(yfVarB, str2);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            pg2 pg2VarA8 = cw1.a(pg2VarA7, new lw1((h81) objB0));
            j30VarQ.e(-469327184);
            qnHx = new Z7jl.QnHx();
            iD = qnHx.d(new rq4(((rv) j30VarQ.E(sv.a)).g(), 0L, x41Var3, (v41) null, (w41) null, (e41) null, (String) null, 0L, (x8) null, (a55) null, (z42) null, 0L, (a25) null, (yi4) null, 16378));
            qnHx.a.append(str);
            sd5 sd5Var4 = sd5.a;
            qnHx.c(iD);
            Z7jl z7jlE4 = qnHx.e();
            j30VarQ.R(false);
            j30VarQ.e(511388516);
            zI2 = j30VarQ.I(yfVarB) | j30VarQ.I(str2);
            objB1 = j30VarQ.b0();
            if (zI2) {
                objB1 = new CQf(yfVarB, str2);
                j30VarQ.F0(objB1);
            } else {
                objB1 = new CQf(yfVarB, str2);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            xr.a(z7jlE4, pg2VarA8, w55Var2, false, 0, 0, null, (j81) objB1, j30VarQ, i3 & 896, 120);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(str, str2, w55Var2, x41Var3, i, i2);
    }

    public static final void b(pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-856568343);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            n64.a(pg2Var, 0, x00.a, j30VarQ, (i3 & 14) | 384, 2);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(pg2Var, i, i2);
    }

    public static final void c(n22 n22Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-165408624);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(n22Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            hx0 hx0Var = gm4.a;
            j30VarQ.e(-483455358);
            rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(hx0Var);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            a(n22Var.a, n22Var.b, ((rc5) j30VarQ.E(sc5.a)).f, x41.B, j30VarQ, 3072, 0);
            q70.a(X.m(j30VarQ, -1833575781, new s22(n22Var)), j30VarQ, 6);
            j30VarQ.R(false);
            j30VarQ.R(false);
            j30VarQ.R(true);
            j30VarQ.R(false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new t22(n22Var, i);
    }
}
