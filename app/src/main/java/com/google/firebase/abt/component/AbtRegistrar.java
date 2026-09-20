package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.CSv;
import defpackage.kj0;
import defpackage.n8V_;
import defpackage.q22;
import defpackage.ry;
import defpackage.tN;
import defpackage.yy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ tN lambda$getComponents$0(yy yyVar) {
        return new tN((Context) yyVar.d(Context.class), yyVar.u(CSv.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ry<?>> getComponents() {
        ry.QnHx qnHxA = ry.a(tN.class);
        qnHxA.a(new kj0(1, 0, Context.class));
        qnHxA.a(new kj0(0, 1, CSv.class));
        qnHxA.e = new n8V_(0);
        return Arrays.asList(qnHxA.b(), q22.a("fire-abt", "21.0.2"));
    }
}
