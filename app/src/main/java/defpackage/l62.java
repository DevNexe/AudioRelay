package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {98}, m = "invokeSuspend")
public final class l62 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ g25 C;

    @if0(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
    public static final class QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ g25 B;
        public d93 y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(g25 g25Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = g25Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.B, z80Var);
            qnHx.A = obj;
            return qnHx;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0069  */
        /* JADX WARN: Code duplicated, block: B:21:0x0079  */
        /* JADX WARN: Code duplicated, block: B:24:0x007f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0084 A[LOOP:0: B:18:0x0067->B:27:0x0084, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:32:0x0082 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:17:0x005d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
                int r2 = r0.z
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2d
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                d93 r2 = r0.y
                java.lang.Object r5 = r0.A
                a5 r5 = (defpackage.a5) r5
                defpackage.C0239D.H(r18)
                r7 = r18
                r6 = r0
                goto L5d
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L23:
                java.lang.Object r2 = r0.A
                a5 r2 = (defpackage.a5) r2
                defpackage.C0239D.H(r18)
                r5 = r18
                goto L41
            L2d:
                defpackage.C0239D.H(r18)
                java.lang.Object r2 = r0.A
                a5 r2 = (defpackage.a5) r2
                r0.A = r2
                r0.z = r4
                z83 r5 = defpackage.z83.Main
                java.lang.Object r5 = defpackage.p05.b(r2, r5, r4, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                d93 r5 = (defpackage.d93) r5
                long r6 = r5.c
                g25 r6 = r0.B
                r6.c()
                r6 = r0
                r16 = r5
                r5 = r2
                r2 = r16
            L50:
                r6.A = r5
                r6.y = r2
                r6.z = r3
                java.lang.Object r7 = defpackage.z4.a(r5, r6)
                if (r7 != r1) goto L5d
                return r1
            L5d:
                y83 r7 = (defpackage.y83) r7
                java.util.List<d93> r7 = r7.a
                int r8 = r7.size()
                r9 = 0
                r10 = 0
            L67:
                if (r10 >= r8) goto L87
                java.lang.Object r11 = r7.get(r10)
                d93 r11 = (defpackage.d93) r11
                long r12 = r11.a
                long r14 = r2.a
                boolean r12 = defpackage.c93.a(r12, r14)
                if (r12 == 0) goto L7f
                boolean r11 = r11.d
                if (r11 == 0) goto L7f
                r11 = 1
                goto L80
            L7f:
                r11 = 0
            L80:
                if (r11 == 0) goto L84
                r9 = 1
                goto L87
            L84:
                int r10 = r10 + 1
                goto L67
            L87:
                if (r9 != 0) goto L50
                g25 r1 = r6.B
                r1.b()
                sd5 r1 = defpackage.sd5.a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l62.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(a5Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l62(g25 g25Var, z80<? super l62> z80Var) {
        super(2, z80Var);
        this.C = g25Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        l62 l62Var = new l62(this.C, z80Var);
        l62Var.B = obj;
        return l62Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.C, null);
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
        return ((l62) a(l93Var, z80Var)).i(sd5.a);
    }
}
