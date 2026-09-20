package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {116, 122}, m = "invokeSuspend")
public final class um5 extends px4 implements x81<nz0<? super Float>, z80<? super sd5>, Object> {
    public wo A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ ContentResolver D;
    public final /* synthetic */ Uri E;
    public final /* synthetic */ vm5 F;
    public final /* synthetic */ jo<sd5> G;
    public final /* synthetic */ Context H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um5(ContentResolver contentResolver, Uri uri, vm5 vm5Var, jo<sd5> joVar, Context context, z80<? super um5> z80Var) {
        super(2, z80Var);
        this.D = contentResolver;
        this.E = uri;
        this.F = vm5Var;
        this.G = joVar;
        this.H = context;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        um5 um5Var = new um5(this.D, this.E, this.F, this.G, this.H, z80Var);
        um5Var.C = obj;
        return um5Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #1 {all -> 0x0088, blocks: (B:21:0x0058, B:23:0x0060), top: B:39:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:37:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r10) {
        /*
            r9 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r9.B
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            wo r1 = r9.A
            java.lang.Object r4 = r9.C
            nz0 r4 = (defpackage.nz0) r4
            defpackage.C0239D.H(r10)     // Catch: java.lang.Throwable -> L99
            goto L44
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            wo r1 = r9.A
            java.lang.Object r4 = r9.C
            nz0 r4 = (defpackage.nz0) r4
            defpackage.C0239D.H(r10)     // Catch: java.lang.Throwable -> L99
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L58
        L2c:
            defpackage.C0239D.H(r10)
            java.lang.Object r10 = r9.C
            r4 = r10
            nz0 r4 = (defpackage.nz0) r4
            android.content.ContentResolver r10 = r9.D
            android.net.Uri r1 = r9.E
            r5 = 0
            vm5 r6 = r9.F
            r10.registerContentObserver(r1, r5, r6)
            jo<sd5> r10 = r9.G     // Catch: java.lang.Throwable -> L99
            wo r1 = r10.iterator()     // Catch: java.lang.Throwable -> L99
        L44:
            r10 = r9
        L45:
            r10.C = r4     // Catch: java.lang.Throwable -> L94
            r10.A = r1     // Catch: java.lang.Throwable -> L94
            r10.B = r3     // Catch: java.lang.Throwable -> L94
            java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L94
            if (r5 != r0) goto L52
            return r0
        L52:
            r8 = r0
            r0 = r10
            r10 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L58:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L88
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L88
            if (r10 == 0) goto L8a
            r4.next()     // Catch: java.lang.Throwable -> L88
            android.content.Context r10 = r0.H     // Catch: java.lang.Throwable -> L88
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L88
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L88
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L88
            r0.C = r5     // Catch: java.lang.Throwable -> L88
            r0.A = r4     // Catch: java.lang.Throwable -> L88
            r0.B = r2     // Catch: java.lang.Throwable -> L88
            java.lang.Object r10 = r5.f(r6, r0)     // Catch: java.lang.Throwable -> L88
            if (r10 != r1) goto L83
            return r1
        L83:
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L45
        L88:
            r10 = move-exception
            goto L9b
        L8a:
            android.content.ContentResolver r10 = r0.D
            vm5 r0 = r0.F
            r10.unregisterContentObserver(r0)
            sd5 r10 = defpackage.sd5.a
            return r10
        L94:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L9b
        L99:
            r10 = move-exception
            r0 = r9
        L9b:
            android.content.ContentResolver r1 = r0.D
            vm5 r0 = r0.F
            r1.unregisterContentObserver(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um5.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<? super Float> nz0Var, z80<? super sd5> z80Var) {
        return ((um5) a(nz0Var, z80Var)).i(sd5.a);
    }
}
