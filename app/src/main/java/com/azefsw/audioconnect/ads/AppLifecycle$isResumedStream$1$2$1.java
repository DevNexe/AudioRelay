package com.azefsw.audioconnect.ads;

import androidx.activity.ComponentActivity;
import defpackage.C0239D;
import defpackage.cx1;
import defpackage.d32;
import defpackage.h81;
import defpackage.if0;
import defpackage.pe3;
import defpackage.px4;
import defpackage.sd5;
import defpackage.te3;
import defpackage.va0;
import defpackage.w61;
import defpackage.x81;
import defpackage.z80;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.AppLifecycle$isResumedStream$1$2$1", f = "AppLifecycle.kt", l = {41}, m = "invokeSuspend")
public final class AppLifecycle$isResumedStream$1$2$1 extends px4 implements x81<te3<? super Boolean>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ComponentActivity C;

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ ComponentActivity w;
        public final /* synthetic */ AppLifecycle$isResumedStream$1$2$1$observer$1 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ComponentActivity componentActivity, AppLifecycle$isResumedStream$1$2$1$observer$1 appLifecycle$isResumedStream$1$2$1$observer$1) {
            super(0);
            this.w = componentActivity;
            this.x = appLifecycle$isResumedStream$1$2$1$observer$1;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.z.c(this.x);
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycle$isResumedStream$1$2$1(ComponentActivity componentActivity, z80<? super AppLifecycle$isResumedStream$1$2$1> z80Var) {
        super(2, z80Var);
        this.C = componentActivity;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        AppLifecycle$isResumedStream$1$2$1 appLifecycle$isResumedStream$1$2$1 = new AppLifecycle$isResumedStream$1$2$1(this.C, z80Var);
        appLifecycle$isResumedStream$1$2$1.B = obj;
        return appLifecycle$isResumedStream$1$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [c32, com.azefsw.audioconnect.ads.AppLifecycle$isResumedStream$1$2$1$observer$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            final te3 te3Var = (te3) this.B;
            ?? r1 = new w61() { // from class: com.azefsw.audioconnect.ads.AppLifecycle$isResumedStream$1$2$1$observer$1
                @Override // defpackage.w61
                public final /* synthetic */ void onCreate(d32 d32Var) {
                }

                @Override // defpackage.w61
                public final /* synthetic */ void onDestroy(d32 d32Var) {
                }

                @Override // defpackage.w61
                public final void onPause(d32 d32Var) {
                    te3Var.H(Boolean.FALSE);
                }

                @Override // defpackage.w61
                public final void onResume(d32 d32Var) {
                    te3Var.H(Boolean.FALSE);
                }

                @Override // defpackage.w61
                public final /* synthetic */ void onStart(d32 d32Var) {
                }

                @Override // defpackage.w61
                public final /* synthetic */ void onStop(d32 d32Var) {
                }
            };
            ComponentActivity componentActivity = this.C;
            componentActivity.z.a(r1);
            QnHx qnHx = new QnHx(componentActivity, r1);
            this.A = 1;
            if (pe3.a(te3Var, qnHx, this) == va0Var) {
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
    public final Object invoke(te3<? super Boolean> te3Var, z80<? super sd5> z80Var) {
        return ((AppLifecycle$isResumedStream$1$2$1) a(te3Var, z80Var)).i(sd5.a);
    }
}
