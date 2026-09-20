package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface Ld {

    public final class e extends cx1 implements j81<Boolean, sd5> {
        public final /* synthetic */ j81<If$, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(j81<? super If$, sd5> j81Var) {
            super(1);
            this.w = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Boolean bool) {
            this.w.invoke(new If$.NUlFixed(bool.booleanValue()));
            return sd5.a;
        }
    }

    jx2 a();

    bf5 b();

    fTO$ c();

    dd2 d();

    gu4 e();

    Context getContext();
}
