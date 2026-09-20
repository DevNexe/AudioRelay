package io.ktor.websocket;

import defpackage.fl3;
import defpackage.if0;
import defpackage.nk3;
import defpackage.p61;
import defpackage.px4;
import defpackage.q94;
import defpackage.sd5;
import defpackage.ua0;
import defpackage.wo;
import defpackage.x81;
import defpackage.z80;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", l = {320, 161, 208, 166, 167, 169, 193, 208, 208, 208, 208}, m = "invokeSuspend")
public final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public Object A;
    public fl3 B;
    public Object C;
    public q94 D;
    public nk3 E;
    public wo F;
    public p61 G;
    public int H;
    public final /* synthetic */ CQf I;
    public final /* synthetic */ q94<p61.LPt8Fixed> J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QnHx(CQf cQf, q94<? super p61.LPt8Fixed> q94Var, z80<? super QnHx> z80Var) {
        super(2, z80Var);
        this.I = cQf;
        this.J = q94Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new QnHx(this.I, this.J, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0254 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9 A[Catch: all -> 0x02a6, TryCatch #3 {all -> 0x02a6, blocks: (B:39:0x00f1, B:41:0x00f9, B:43:0x0103, B:45:0x010b, B:47:0x0117, B:48:0x0119, B:67:0x017b, B:69:0x017f, B:71:0x0185, B:77:0x01a5, B:79:0x01a9, B:83:0x01ca), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x017b A[Catch: all -> 0x02a6, TRY_ENTER, TryCatch #3 {all -> 0x02a6, blocks: (B:39:0x00f1, B:41:0x00f9, B:43:0x0103, B:45:0x010b, B:47:0x0117, B:48:0x0119, B:67:0x017b, B:69:0x017f, B:71:0x0185, B:77:0x01a5, B:79:0x01a9, B:83:0x01ca), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x017f A[Catch: all -> 0x02a6, TryCatch #3 {all -> 0x02a6, blocks: (B:39:0x00f1, B:41:0x00f9, B:43:0x0103, B:45:0x010b, B:47:0x0117, B:48:0x0119, B:67:0x017b, B:69:0x017f, B:71:0x0185, B:77:0x01a5, B:79:0x01a9, B:83:0x01ca), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0185 A[Catch: all -> 0x02a6, TRY_LEAVE, TryCatch #3 {all -> 0x02a6, blocks: (B:39:0x00f1, B:41:0x00f9, B:43:0x0103, B:45:0x010b, B:47:0x0117, B:48:0x0119, B:67:0x017b, B:69:0x017f, B:71:0x0185, B:77:0x01a5, B:79:0x01a9, B:83:0x01ca), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5 A[Catch: all -> 0x02a6, TRY_ENTER, TryCatch #3 {all -> 0x02a6, blocks: (B:39:0x00f1, B:41:0x00f9, B:43:0x0103, B:45:0x010b, B:47:0x0117, B:48:0x0119, B:67:0x017b, B:69:0x017f, B:71:0x0185, B:77:0x01a5, B:79:0x01a9, B:83:0x01ca), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9 A[Catch: all -> 0x02a6, TryCatch #3 {all -> 0x02a6, blocks: (B:39:0x00f1, B:41:0x00f9, B:43:0x0103, B:45:0x010b, B:47:0x0117, B:48:0x0119, B:67:0x017b, B:69:0x017f, B:71:0x0185, B:77:0x01a5, B:79:0x01a9, B:83:0x01ca), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca A[Catch: all -> 0x02a6, TRY_LEAVE, TryCatch #3 {all -> 0x02a6, blocks: (B:39:0x00f1, B:41:0x00f9, B:43:0x0103, B:45:0x010b, B:47:0x0117, B:48:0x0119, B:67:0x017b, B:69:0x017f, B:71:0x0185, B:77:0x01a5, B:79:0x01a9, B:83:0x01ca), top: B:166:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ee A[Catch: all -> 0x025c, TryCatch #12 {all -> 0x025c, blocks: (B:87:0x01ea, B:89:0x01ee, B:91:0x01f2, B:92:0x01f9, B:93:0x0203, B:95:0x0209, B:96:0x0222, B:97:0x022c, B:99:0x0232, B:100:0x023d), top: B:175:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f2 A[Catch: all -> 0x025c, TryCatch #12 {all -> 0x025c, blocks: (B:87:0x01ea, B:89:0x01ee, B:91:0x01f2, B:92:0x01f9, B:93:0x0203, B:95:0x0209, B:96:0x0222, B:97:0x022c, B:99:0x0232, B:100:0x023d), top: B:175:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0203 A[Catch: all -> 0x025c, TryCatch #12 {all -> 0x025c, blocks: (B:87:0x01ea, B:89:0x01ee, B:91:0x01f2, B:92:0x01f9, B:93:0x0203, B:95:0x0209, B:96:0x0222, B:97:0x022c, B:99:0x0232, B:100:0x023d), top: B:175:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0209 A[Catch: all -> 0x025c, TryCatch #12 {all -> 0x025c, blocks: (B:87:0x01ea, B:89:0x01ee, B:91:0x01f2, B:92:0x01f9, B:93:0x0203, B:95:0x0209, B:96:0x0222, B:97:0x022c, B:99:0x0232, B:100:0x023d), top: B:175:0x01ea }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0232 A[Catch: all -> 0x025c, LOOP:0: B:97:0x022c->B:99:0x0232, LOOP_END, TryCatch #12 {all -> 0x025c, blocks: (B:87:0x01ea, B:89:0x01ee, B:91:0x01f2, B:92:0x01f9, B:93:0x0203, B:95:0x0209, B:96:0x0222, B:97:0x022c, B:99:0x0232, B:100:0x023d), top: B:175:0x01ea }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [T, ek] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01e6 -> B:11:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.QnHx.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
    }
}
