package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.Ya;
import defpackage.ah0;
import defpackage.kj0;
import defpackage.mk5;
import defpackage.n8V_;
import defpackage.o22;
import defpackage.q22;
import defpackage.qx0;
import defpackage.rc1;
import defpackage.ry;
import defpackage.sc1;
import defpackage.tc1;
import defpackage.un;
import defpackage.uw1;
import defpackage.ze5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<ry<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        ry.QnHx qnHxA = ry.a(ze5.class);
        qnHxA.a(new kj0(2, 0, o22.class));
        int i = 1;
        qnHxA.e = new n8V_(i);
        arrayList.add(qnHxA.b());
        ry.QnHx qnHx = new ry.QnHx(ah0.class, new Class[]{sc1.class, tc1.class});
        qnHx.a(new kj0(1, 0, Context.class));
        qnHx.a(new kj0(1, 0, qx0.class));
        qnHx.a(new kj0(2, 0, rc1.class));
        qnHx.a(new kj0(1, 1, ze5.class));
        qnHx.e = new Ya();
        arrayList.add(qnHx.b());
        arrayList.add(q22.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(q22.a("fire-core", "20.1.2"));
        arrayList.add(q22.a("device-name", a(Build.PRODUCT)));
        arrayList.add(q22.a("device-model", a(Build.DEVICE)));
        arrayList.add(q22.a("device-brand", a(Build.BRAND)));
        arrayList.add(q22.b("android-target-sdk", new un(i)));
        arrayList.add(q22.b("android-min-sdk", new mk5(6)));
        arrayList.add(q22.b("android-platform", new n8V_(8)));
        arrayList.add(q22.b("android-installer", new un(2)));
        try {
            string = uw1.A.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(q22.a("kotlin", string));
        }
        return arrayList;
    }
}
