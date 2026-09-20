package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.CQf;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.azefsw.audioconnect.R;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class sh3 extends ConstraintLayout {
    public final QnHx M;
    public int N;
    public la2 O;

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            sh3.this.g();
        }
    }

    public sh3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            Field field = bi5.a;
            view.setId(bi5.NUlFixed.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            QnHx qnHx = this.M;
            handler.removeCallbacks(qnHx);
            handler.post(qnHx);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        CQf cQf = new CQf();
        cQf.b(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.N;
                HashMap<Integer, CQf.QnHx> map = cQf.c;
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new CQf.QnHx());
                }
                CQf.C0021CQf c0021CQf = map.get(Integer.valueOf(id)).d;
                c0021CQf.w = R.id.circle_center;
                c0021CQf.x = i4;
                c0021CQf.y = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        cQf.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            QnHx qnHx = this.M;
            handler.removeCallbacks(qnHx);
            handler.post(qnHx);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.O.j(ColorStateList.valueOf(i));
    }

    public sh3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        la2 la2Var = new la2();
        this.O = la2Var;
        sl3 sl3Var = new sl3(0.5f);
        ej4 ej4Var = la2Var.w.a;
        ej4Var.getClass();
        ej4.QnHx qnHx = new ej4.QnHx(ej4Var);
        qnHx.e = sl3Var;
        qnHx.f = sl3Var;
        qnHx.g = sl3Var;
        qnHx.h = sl3Var;
        la2Var.setShapeAppearanceModel(new ej4(qnHx));
        this.O.j(ColorStateList.valueOf(-1));
        la2 la2Var2 = this.O;
        Field field = bi5.a;
        bi5.LPt8Fixed.q(this, la2Var2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.P, i, 0);
        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.M = new QnHx();
        typedArrayObtainStyledAttributes.recycle();
    }
}
