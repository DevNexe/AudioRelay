package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.RBi;
import com.azefsw.audioconnect.R;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.ef0;
import defpackage.ha2;
import defpackage.ia2;
import defpackage.la2;
import defpackage.lf5;
import defpackage.ma2;
import defpackage.nk0;
import defpackage.to1;
import defpackage.u23;
import defpackage.w92;
import defpackage.wu2;
import defpackage.zg2;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class LPt8Fixed<S> extends nk0 {
    public static final /* synthetic */ int V0 = 0;
    public final LinkedHashSet<ia2<? super S>> E0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> F0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> G0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> H0 = new LinkedHashSet<>();
    public int I0;
    public ef0<S> J0;
    public u23<S> K0;
    public com.google.android.material.datepicker.QnHx L0;
    public com.google.android.material.datepicker.F1<S> M0;
    public int N0;
    public CharSequence O0;
    public boolean P0;
    public int Q0;
    public TextView R0;
    public CheckableImageButton S0;
    public la2 T0;
    public Button U0;

    public class CQf implements View.OnClickListener {
        public CQf() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LPt8Fixed lPt8 = LPt8Fixed.this;
            Iterator<View.OnClickListener> it = lPt8.F0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            lPt8.N(false, false);
        }
    }

    public class F1 extends wu2<S> {
        public F1() {
        }

        @Override // defpackage.wu2
        public final void a(S s) {
            int i = LPt8Fixed.V0;
            LPt8Fixed lPt8 = LPt8Fixed.this;
            lPt8.V();
            lPt8.U0.setEnabled(lPt8.J0.r());
        }
    }

    public class QnHx implements View.OnClickListener {
        public QnHx() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LPt8Fixed lPt8 = LPt8Fixed.this;
            for (ia2<? super S> ia2Var : lPt8.E0) {
                lPt8.J0.c();
                ia2Var.a();
            }
            lPt8.N(false, false);
        }
    }

    public static int Q(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        zg2 zg2Var = new zg2(lf5.c());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = zg2Var.z;
        return ((i - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i) + (dimensionPixelOffset * 2);
    }

    public static boolean R(Context context) {
        return S(context, android.R.attr.windowFullscreen);
    }

    public static boolean S(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(w92.b(context, com.google.android.material.datepicker.F1.class.getCanonicalName(), R.attr.materialCalendarStyle), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // defpackage.nk0, androidx.fragment.app.Fragment
    public final void A() {
        this.K0.o0.clear();
        super.A();
    }

    @Override // defpackage.nk0
    public final Dialog O() {
        Context contextI = I();
        I();
        int iM = this.I0;
        if (iM == 0) {
            iM = this.J0.m();
        }
        Dialog dialog = new Dialog(contextI, iM);
        Context context = dialog.getContext();
        this.P0 = R(context);
        int iB = w92.b(context, LPt8Fixed.class.getCanonicalName(), R.attr.colorSurface);
        la2 la2Var = new la2(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.T0 = la2Var;
        la2Var.h(context);
        this.T0.j(ColorStateList.valueOf(iB));
        la2 la2Var2 = this.T0;
        View decorView = dialog.getWindow().getDecorView();
        Field field = bi5.a;
        la2Var2.i(bi5.byN.i(decorView));
        return dialog;
    }

    public final void T() {
        u23<S> ma2Var;
        I();
        int iM = this.I0;
        if (iM == 0) {
            iM = this.J0.m();
        }
        ef0<S> ef0Var = this.J0;
        com.google.android.material.datepicker.QnHx qnHx = this.L0;
        com.google.android.material.datepicker.F1<S> f1 = new com.google.android.material.datepicker.F1<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iM);
        bundle.putParcelable("GRID_SELECTOR_KEY", ef0Var);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", qnHx);
        bundle.putParcelable("CURRENT_MONTH_KEY", qnHx.z);
        f1.L(bundle);
        this.M0 = f1;
        if (this.S0.isChecked()) {
            ef0<S> ef0Var2 = this.J0;
            com.google.android.material.datepicker.QnHx qnHx2 = this.L0;
            ma2Var = new ma2<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iM);
            bundle2.putParcelable("DATE_SELECTOR_KEY", ef0Var2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", qnHx2);
            ma2Var.L(bundle2);
        } else {
            ma2Var = this.M0;
        }
        this.K0 = ma2Var;
        V();
        RBi rBiI = i();
        rBiI.getClass();
        androidx.fragment.app.QnHx qnHx3 = new androidx.fragment.app.QnHx(rBiI);
        qnHx3.e(R.id.mtrl_calendar_frame, this.K0, null, 2);
        if (qnHx3.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        qnHx3.p.y(qnHx3, false);
        this.K0.N(new F1());
    }

    public final void V() {
        ef0<S> ef0Var = this.J0;
        j();
        String strE = ef0Var.e();
        this.R0.setContentDescription(String.format(I().getResources().getString(R.string.mtrl_picker_announce_current_selection), strE));
        this.R0.setText(strE);
    }

    public final void W(CheckableImageButton checkableImageButton) {
        this.S0.setContentDescription(this.S0.isChecked() ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // defpackage.nk0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.G0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // defpackage.nk0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.H0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.a0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.nk0, androidx.fragment.app.Fragment
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.I0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.J0 = (ef0) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.L0 = (com.google.android.material.datepicker.QnHx) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.N0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.Q0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.P0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.P0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(Q(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(R.id.mtrl_calendar_main_pane);
            View viewFindViewById2 = viewInflate.findViewById(R.id.mtrl_calendar_frame);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(Q(context), -1));
            Resources resources = I().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i = NUlFixed.B;
            viewFindViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.R0 = textView;
        Field field = bi5.a;
        bi5.auxFixed.f(textView, 1);
        this.S0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.O0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.N0);
        }
        this.S0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.S0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, XTd3.l(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], XTd3.l(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.S0.setChecked(this.Q0 != 0);
        bi5.m(this.S0, null);
        W(this.S0);
        this.S0.setOnClickListener(new ha2(this));
        this.U0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (this.J0.r()) {
            this.U0.setEnabled(true);
        } else {
            this.U0.setEnabled(false);
        }
        this.U0.setTag("CONFIRM_BUTTON_TAG");
        this.U0.setOnClickListener(new QnHx());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new CQf());
        return viewInflate;
    }

    @Override // defpackage.nk0, androidx.fragment.app.Fragment
    public final void y(Bundle bundle) {
        super.y(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.I0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.J0);
        com.google.android.material.datepicker.QnHx.CQf cQf = new com.google.android.material.datepicker.QnHx.CQf(this.L0);
        zg2 zg2Var = this.M0.s0;
        if (zg2Var != null) {
            cQf.c = Long.valueOf(zg2Var.B);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cQf.d);
        zg2 zg2VarL = zg2.l(cQf.a);
        zg2 zg2VarL2 = zg2.l(cQf.b);
        com.google.android.material.datepicker.QnHx.F1 f1 = (com.google.android.material.datepicker.QnHx.F1) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = cQf.c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.QnHx(zg2VarL, zg2VarL2, f1, l == null ? null : zg2.l(l.longValue())));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.N0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.O0);
    }

    @Override // defpackage.nk0, androidx.fragment.app.Fragment
    public final void z() {
        super.z();
        Window window = P().getWindow();
        if (this.P0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.T0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = I().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.T0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new to1(P(), rect));
        }
        T();
    }
}
