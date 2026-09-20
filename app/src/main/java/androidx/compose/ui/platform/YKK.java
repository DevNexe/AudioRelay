package androidx.compose.ui.platform;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.azefsw.audioconnect.R;
import defpackage.AY;
import defpackage.FO;
import defpackage.byN;
import defpackage.fp1;
import defpackage.id5;
import defpackage.ip4;
import defpackage.ja1;
import defpackage.k40;
import defpackage.ka1;
import defpackage.l40;
import defpackage.la0;
import defpackage.la1;
import defpackage.n40;
import defpackage.o40;
import defpackage.qo5;
import defpackage.sz;
import defpackage.wo1;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class YKK {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    public static final k40 a(byN byn, l40 l40Var, sz szVar) {
        AndroidComposeView androidComposeView;
        n40 n40Var;
        WrappedComposition wrappedComposition;
        boolean z = false;
        if (la1.a.compareAndSet(false, true)) {
            defpackage.NUlFixed nUlA = AY.a(-1, null, 6);
            fp1.k0(fp1.j((la0) FO.I.getValue()), null, 0, new ja1(nUlA, null), 3);
            ka1 ka1Var = new ka1(nUlA);
            synchronized (ip4.c) {
                ip4.h.add(ka1Var);
            }
            ip4.a();
        }
        if (byn.getChildCount() > 0) {
            View childAt = byn.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(byn.getContext());
                byn.addView(androidComposeView.getView(), a);
            }
            if (Build.VERSION.SDK_INT >= 29 && (!qo5.a.a(androidComposeView).isEmpty())) {
                z = true;
            }
            if (z) {
                androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                wo1.QnHx qnHx = wo1.a;
                try {
                    Field declaredField = wo1.class.getDeclaredField("b");
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(null, true);
                } catch (Exception unused) {
                    Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
                }
            }
            id5 id5Var = new id5(androidComposeView.getRoot());
            Object obj = o40.a;
            n40Var = new n40(l40Var, id5Var);
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
            if (wrappedComposition == null) {
                wrappedComposition = new WrappedComposition(androidComposeView, n40Var);
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
            }
            wrappedComposition.p(szVar);
            return wrappedComposition;
        }
        byn.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(byn.getContext());
            byn.addView(androidComposeView.getView(), a);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        if (z) {
            androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            wo1.QnHx qnHx2 = wo1.a;
            Field declaredField2 = wo1.class.getDeclaredField("b");
            declaredField2.setAccessible(true);
            declaredField2.setBoolean(null, true);
        }
        id5 id5Var2 = new id5(androidComposeView.getRoot());
        Object obj2 = o40.a;
        n40Var = new n40(l40Var, id5Var2);
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, n40Var);
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.p(szVar);
        return wrappedComposition;
    }
}
