package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {134, 138, 160}, m = "invokeSuspend")
public final class vp4 extends px4 implements x81<nz0<Object>, z80<? super sd5>, Object> {
    public Set A;
    public j81 B;
    public jo C;
    public jt2 D;
    public Object E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ h81<Object> H;

    public static final class CQf extends cx1 implements x81<Set<? extends Object>, cp4, sd5> {
        public final /* synthetic */ jo<Set<Object>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(NUlFixed nUl) {
            super(2);
            this.w = nUl;
        }

        @Override // defpackage.x81
        public final sd5 invoke(Set<? extends Object> set, cp4 cp4Var) {
            this.w.H(set);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<Object, sd5> {
        public final /* synthetic */ Set<Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(LinkedHashSet linkedHashSet) {
            super(1);
            this.w = linkedHashSet;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Object obj) {
            this.w.add(obj);
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp4(h81<Object> h81Var, z80<? super vp4> z80Var) {
        super(2, z80Var);
        this.H = h81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        vp4 vp4Var = new vp4(this.H, z80Var);
        vp4Var.G = obj;
        return vp4Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[Catch: all -> 0x013d, TryCatch #5 {all -> 0x013d, blocks: (B:35:0x00cf, B:37:0x00d5, B:42:0x00df, B:45:0x00ed, B:49:0x0105, B:51:0x010e, B:60:0x012f, B:61:0x0132, B:46:0x00fa, B:48:0x0102, B:58:0x012b, B:59:0x012e, B:47:0x00fe), top: B:85:0x00cf, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #5 {all -> 0x013d, blocks: (B:35:0x00cf, B:37:0x00d5, B:42:0x00df, B:45:0x00ed, B:49:0x0105, B:51:0x010e, B:60:0x012f, B:61:0x0132, B:46:0x00fa, B:48:0x0102, B:58:0x012b, B:59:0x012e, B:47:0x00fe), top: B:85:0x00cf, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010e A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #5 {all -> 0x013d, blocks: (B:35:0x00cf, B:37:0x00d5, B:42:0x00df, B:45:0x00ed, B:49:0x0105, B:51:0x010e, B:60:0x012f, B:61:0x0132, B:46:0x00fa, B:48:0x0102, B:58:0x012b, B:59:0x012e, B:47:0x00fe), top: B:85:0x00cf, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0133 -> B:31:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp4.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<Object> nz0Var, z80<? super sd5> z80Var) {
        return ((vp4) a(nz0Var, z80Var)).i(sd5.a);
    }
}
