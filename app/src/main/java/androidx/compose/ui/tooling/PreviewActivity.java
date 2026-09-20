package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import defpackage.X;
import defpackage.ia4;
import defpackage.mv4;
import defpackage.td3;
import defpackage.tw1;
import defpackage.x94;
import defpackage.xd3;
import defpackage.xy;
import defpackage.yd3;
import defpackage.zd3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {
    public final String K = "PreviewActivity";

    @Override // androidx.activity.ComponentActivity, defpackage.wy, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        Class<?> cls;
        Object[] objArr;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.K;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        int iH = mv4.H(stringExtra, '.', 0, 6);
        String strSubstring = iH == -1 ? stringExtra : stringExtra.substring(0, iH);
        String strV = mv4.V(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strV + "' without a parameter provider.");
            xy.a(this, X.n(-161032931, new td3(strSubstring, strV), true));
            return;
        }
        Log.d(str, "Previewing '" + strV + "' with parameter provider: '" + stringExtra2 + '\'');
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewProvider", "Unable to find provider '" + stringExtra2 + '\'', e);
            cls = null;
        }
        int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 >= length) {
                        if (z) {
                            break;
                        } else {
                            break;
                        }
                    }
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            constructor = constructor2;
                            z = true;
                        }
                    }
                    i2++;
                    constructor = null;
                    break;
                }
                if (constructor == null) {
                    throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                }
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(new Object[0]);
                if (objNewInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                }
                zd3 zd3Var = (zd3) objNewInstance;
                if (intExtra < 0) {
                    x94 x94VarA = zd3Var.a();
                    int count = zd3Var.getCount();
                    Iterator it = x94VarA.iterator();
                    objArr = new Object[count];
                    for (int i3 = 0; i3 < count; i3++) {
                        objArr[i3] = it.next();
                    }
                } else {
                    Object[] objArr2 = new Object[1];
                    x94 x94VarA2 = zd3Var.a();
                    ia4 ia4Var = new ia4(intExtra);
                    if (intExtra < 0) {
                        ia4Var.invoke(Integer.valueOf(intExtra));
                        throw null;
                    }
                    Iterator it2 = x94VarA2.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            ia4Var.invoke(Integer.valueOf(intExtra));
                            throw null;
                        }
                        Object next = it2.next();
                        int i5 = i4 + 1;
                        if (intExtra == i4) {
                            objArr2[0] = next;
                            objArr = objArr2;
                            break;
                        }
                        i4 = i5;
                    }
                }
            } catch (tw1 unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        } else {
            objArr = new Object[0];
        }
        if (objArr.length > 1) {
            xy.a(this, X.n(-1735847170, new xd3(strSubstring, strV, objArr), true));
        } else {
            xy.a(this, X.n(1507674311, new yd3(strSubstring, strV, objArr), true));
        }
    }
}
