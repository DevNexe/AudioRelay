package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yj1 {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public Animator f;
    public final float g;
    public int h;
    public int i;
    public CharSequence j;
    public boolean k;
    public g14c l;
    public CharSequence m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public g14c r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    public class QnHx extends AnimatorListenerAdapter {
        public final /* synthetic */ int w;
        public final /* synthetic */ TextView x;
        public final /* synthetic */ int y;
        public final /* synthetic */ TextView z;

        public QnHx(int i, TextView textView, int i2, TextView textView2) {
            this.w = i;
            this.x = textView;
            this.y = i2;
            this.z = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            g14c g14cVar;
            int i = this.w;
            yj1 yj1Var = yj1.this;
            yj1Var.h = i;
            yj1Var.f = null;
            TextView textView = this.x;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.y == 1 && (g14cVar = yj1Var.l) != null) {
                    g14cVar.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.z;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.z;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public yj1(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i) {
        if (this.c == null && this.e == null) {
            Context context = this.a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.c;
            TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.e = new FrameLayout(context);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.e.setVisibility(0);
            this.e.addView(textView);
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        LinearLayout linearLayout = this.c;
        TextInputLayout textInputLayout = this.b;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.a;
            boolean zD = ja2.d(context);
            LinearLayout linearLayout2 = this.c;
            Field field = bi5.a;
            int iF = bi5.NUlFixed.f(editText);
            if (zD) {
                iF = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (zD) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int iE = bi5.NUlFixed.e(editText);
            if (zD) {
                iE = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            bi5.NUlFixed.k(linearLayout2, iF, dimensionPixelSize, iE, 0);
        }
    }

    public final void c() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(ur.a);
            arrayList.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.g, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(ur.d);
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.i != 1 || this.l == null || TextUtils.isEmpty(this.j)) ? false : true;
    }

    public final TextView f(int i) {
        if (i == 1) {
            return this.l;
        }
        if (i != 2) {
            return null;
        }
        return this.r;
    }

    public final int g() {
        g14c g14cVar = this.l;
        if (g14cVar != null) {
            return g14cVar.getCurrentTextColor();
        }
        return -1;
    }

    public final void h() {
        this.j = null;
        c();
        if (this.h == 1) {
            if (!this.q || TextUtils.isEmpty(this.p)) {
                this.i = 0;
            } else {
                this.i = 2;
            }
        }
        k(this.h, this.i, j(this.l, null));
    }

    public final void i(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (!z || (frameLayout = this.e) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.d - 1;
        this.d = i2;
        LinearLayout linearLayout2 = this.c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean j(TextView textView, CharSequence charSequence) {
        Field field = bi5.a;
        TextInputLayout textInputLayout = this.b;
        return bi5.auxFixed.c(textInputLayout) && textInputLayout.isEnabled() && !(this.i == this.h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void k(int i, int i2, boolean z) {
        TextView textViewF;
        TextView textViewF2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.q, this.r, 2, i, i2);
            d(arrayList, this.k, this.l, 1, i, i2);
            X.A(animatorSet, arrayList);
            animatorSet.addListener(new QnHx(i2, f(i), i, f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewF2 = f(i2)) != null) {
                textViewF2.setVisibility(0);
                textViewF2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewF = f(i)) != null) {
                textViewF.setVisibility(4);
                if (i == 1) {
                    textViewF.setText((CharSequence) null);
                }
            }
            this.h = i2;
        }
        TextInputLayout textInputLayout = this.b;
        textInputLayout.q();
        textInputLayout.s(z, false);
        textInputLayout.z();
    }
}
