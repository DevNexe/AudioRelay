package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.ads.mediation.facebook.FacebookAdapter;
import defpackage.e70;
import defpackage.g7;
import defpackage.k8;
import defpackage.qh3;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class QnHx extends View {
    public String A;
    public final HashMap<Integer, String> B;
    public int[] w;
    public int x;
    public final Context y;
    public k8 z;

    public QnHx(Context context) {
        super(context);
        this.w = new int[32];
        this.B = new HashMap<>();
        this.y = context;
        e(null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    public final void a(String str) {
        Context context;
        int identifier;
        HashMap<String, Integer> map;
        if (str == null || str.length() == 0 || (context = this.y) == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Integer num = ((strTrim instanceof String) && (map = constraintLayout.I) != null && map.containsKey(strTrim)) ? constraintLayout.I.get(strTrim) : null;
            if (num instanceof Integer) {
                identifier = num.intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = d(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = qh3.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, FacebookAdapter.KEY_ID, context.getPackageName());
        }
        if (identifier != 0) {
            this.B.put(Integer.valueOf(identifier), strTrim);
            b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.x + 1;
        int[] iArr = this.w;
        if (i2 > iArr.length) {
            this.w = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.w;
        int i3 = this.x;
        iArr2[i3] = i;
        this.x = i3 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.x; i++) {
            View view = constraintLayout.w.get(this.w[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.y.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g7.y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.A = string;
                    setIds(string);
                }
            }
        }
    }

    public void f(e70 e70Var, boolean z) {
    }

    public final void g() {
        if (this.z == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.QnHx) {
            ((ConstraintLayout.QnHx) layoutParams).l0 = this.z;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.w, this.x);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.A;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.A = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.x = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.A = null;
        this.x = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    public QnHx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new int[32];
        this.B = new HashMap<>();
        this.y = context;
        e(attributeSet);
    }
}
