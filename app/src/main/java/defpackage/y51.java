package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.LPt6Fixed;
import androidx.fragment.app.RBi;
import androidx.fragment.app.ck32;
import androidx.fragment.app.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y51 implements LayoutInflater.Factory2 {
    public final RBi w;

    public class QnHx implements View.OnAttachStateChangeListener {
        public final /* synthetic */ LPt6Fixed w;

        public QnHx(LPt6Fixed lPt6) {
            this.w = lPt6;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            LPt6Fixed lPt6 = this.w;
            Fragment fragment = lPt6.c;
            lPt6.k();
            ck32.f((ViewGroup) fragment.a0.getParent(), y51.this.w.F()).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public y51(RBi rBi) {
        this.w = rBi;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        LPt6Fixed lPt6F;
        boolean zEquals = v51.class.getName().equals(str);
        RBi rBi = this.w;
        if (zEquals) {
            return new v51(context, attributeSet, rBi);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ko6.y);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(y.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentC = resourceId != -1 ? rBi.C(resourceId) : null;
                if (fragmentC == null && string != null) {
                    e61 e61Var = rBi.c;
                    ArrayList arrayList = (ArrayList) e61Var.a;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            Iterator it = ((HashMap) e61Var.b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    fragmentC = null;
                                    break;
                                }
                                LPt6Fixed lPt6 = (LPt6Fixed) it.next();
                                if (lPt6 != null) {
                                    Fragment fragment = lPt6.c;
                                    if (string.equals(fragment.T)) {
                                        fragmentC = fragment;
                                        break;
                                    }
                                }
                            }
                        } else {
                            Fragment fragment2 = (Fragment) arrayList.get(size);
                            if (fragment2 != null && string.equals(fragment2.T)) {
                                fragmentC = fragment2;
                                break;
                            }
                        }
                    }
                }
                if (fragmentC == null && id != -1) {
                    fragmentC = rBi.C(id);
                }
                if (fragmentC == null) {
                    y yVarE = rBi.E();
                    context.getClassLoader();
                    fragmentC = yVarE.a(attributeValue);
                    fragmentC.I = true;
                    fragmentC.R = resourceId != 0 ? resourceId : id;
                    fragmentC.S = id;
                    fragmentC.T = string;
                    fragmentC.J = true;
                    fragmentC.N = rBi;
                    x51<?> x51Var = rBi.p;
                    fragmentC.O = x51Var;
                    Context context2 = x51Var.x;
                    fragmentC.Y = true;
                    if ((x51Var == null ? null : x51Var.w) != null) {
                        fragmentC.Y = true;
                    }
                    lPt6F = rBi.a(fragmentC);
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "Fragment " + fragmentC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (fragmentC.J) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragmentC.J = true;
                    fragmentC.N = rBi;
                    x51<?> x51Var2 = rBi.p;
                    fragmentC.O = x51Var2;
                    Context context3 = x51Var2.x;
                    fragmentC.Y = true;
                    if ((x51Var2 == null ? null : x51Var2.w) != null) {
                        fragmentC.Y = true;
                    }
                    lPt6F = rBi.f(fragmentC);
                    if (RBi.H(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + fragmentC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                fragmentC.Z = (ViewGroup) view;
                lPt6F.k();
                lPt6F.j();
                View view2 = fragmentC.a0;
                if (view2 == null) {
                    throw new IllegalStateException(fc2.a("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentC.a0.getTag() == null) {
                    fragmentC.a0.setTag(string);
                }
                fragmentC.a0.addOnAttachStateChangeListener(new QnHx(lPt6F));
                return fragmentC.a0;
            }
        }
        return null;
    }
}
