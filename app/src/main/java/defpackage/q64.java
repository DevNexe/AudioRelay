package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {271}, m = "invokeSuspend")
public final class q64 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ x54 C;
    public final /* synthetic */ is4<z64> D;

    @if0(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {273}, m = "invokeSuspend")
    public static final class QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
        public final /* synthetic */ x54 A;
        public final /* synthetic */ is4<z64> B;
        public int y;
        public /* synthetic */ Object z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(x54 x54Var, is4<z64> is4Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.A = x54Var;
            this.B = is4Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.A, this.B, z80Var);
            qnHx.z = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0041  */
        /* JADX WARN: Code duplicated, block: B:18:0x0050 A[LOOP:0: B:14:0x003f->B:18:0x0050, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:33:0x004e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x0053 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:13:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r11) {
            /*
                r10 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r10.y
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r10.z
                a5 r1 = (defpackage.a5) r1
                defpackage.C0239D.H(r11)
                r3 = r1
                r1 = r0
                r0 = r10
                goto L35
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                defpackage.C0239D.H(r11)
                java.lang.Object r11 = r10.z
                a5 r11 = (defpackage.a5) r11
                r1 = r11
                r11 = r10
            L25:
                r11.z = r1
                r11.y = r2
                java.lang.Object r3 = defpackage.o64.a(r1, r11)
                if (r3 != r0) goto L30
                return r0
            L30:
                r9 = r0
                r0 = r11
                r11 = r3
                r3 = r1
                r1 = r9
            L35:
                y83 r11 = (defpackage.y83) r11
                java.util.List<d93> r4 = r11.a
                int r5 = r4.size()
                r6 = 0
                r7 = 0
            L3f:
                if (r7 >= r5) goto L53
                java.lang.Object r8 = r4.get(r7)
                d93 r8 = (defpackage.d93) r8
                boolean r8 = r8.b()
                r8 = r8 ^ r2
                if (r8 != 0) goto L50
                r4 = 0
                goto L54
            L50:
                int r7 = r7 + 1
                goto L3f
            L53:
                r4 = 1
            L54:
                if (r4 == 0) goto L97
                r3.a()
                x54 r4 = r0.A
                long r4 = r4.b(r3, r11)
                is4<z64> r7 = r0.B
                java.lang.Object r7 = r7.getValue()
                z64 r7 = (defpackage.z64) r7
                float r4 = r7.d(r4)
                boolean r5 = r7.b
                if (r5 == 0) goto L73
                r5 = -1
                float r5 = (float) r5
                float r4 = r4 * r5
            L73:
                w64 r5 = r7.d
                float r4 = r5.c(r4)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L80
                r4 = 1
                goto L81
            L80:
                r4 = 0
            L81:
                if (r4 != 0) goto L97
                java.util.List<d93> r11 = r11.a
                int r4 = r11.size()
            L89:
                if (r6 >= r4) goto L97
                java.lang.Object r5 = r11.get(r6)
                d93 r5 = (defpackage.d93) r5
                r5.a()
                int r6 = r6 + 1
                goto L89
            L97:
                r11 = r0
                r0 = r1
                r1 = r3
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: q64.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(a5Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q64(x54 x54Var, is4<z64> is4Var, z80<? super q64> z80Var) {
        super(2, z80Var);
        this.C = x54Var;
        this.D = is4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        q64 q64Var = new q64(this.C, this.D, z80Var);
        q64Var.B = obj;
        return q64Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.C, this.D, null);
            this.A = 1;
            if (l93Var.i0(qnHx, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
        return ((q64) a(l93Var, z80Var)).i(sd5.a);
    }
}
