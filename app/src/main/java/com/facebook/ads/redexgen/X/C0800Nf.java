package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0800Nf extends LinearLayout {
    public static final int A03 = (int) (Lr.A00 * 40.0f);
    public static final int A04 = (int) (Lr.A00 * 20.0f);
    public static final int A05 = (int) (Lr.A00 * 10.0f);
    public final C2H A00;
    public final C1075Xy A01;
    public final NP A02;

    public C0800Nf(C1075Xy c1075Xy, C2H c2h, NP np, EnumC0769Ma enumC0769Ma) {
        this(c1075Xy, c2h, np, null, enumC0769Ma);
    }

    public C0800Nf(C1075Xy c1075Xy, C2H c2h, NP np, @Nullable String str, EnumC0769Ma enumC0769Ma) {
        super(c1075Xy);
        this.A01 = c1075Xy;
        this.A00 = c2h;
        this.A02 = np;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View viewA01 = A01(str);
            viewA01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            MS.A0M(view, -10459280);
            addView(viewA01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View viewA00 = A00(enumC0769Ma, this.A00.A03());
            int i = A05;
            viewA00.setPadding(0, i, 0, i);
            addView(viewA00, layoutParams);
        }
        ViewGroup viewGroupA02 = A02();
        viewGroupA02.setPadding(0, A05, 0, 0);
        addView(viewGroupA02, layoutParams);
    }

    private View A00(EnumC0769Ma enumC0769Ma, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(C0770Mb.A01(enumC0769Ma));
        TextView textView = new TextView(getContext());
        MS.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(C0770Mb.A01(EnumC0769Ma.BACK_ARROW));
        int i = A05;
        imageView.setPadding(0, i, i * 2, i);
        int i2 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        imageView.setOnClickListener(new ViewOnClickListenerC0798Nd(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        MS.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A03, 0);
        layoutParams2.gravity = 17;
        LinearLayout header = new LinearLayout(getContext());
        header.setOrientation(0);
        header.addView(imageView, layoutParams);
        header.addView(textView, layoutParams2);
        return header;
    }

    private ViewGroup A02() {
        C0806Nl c0806Nl = new C0806Nl(this.A01);
        for (C2H c2h : this.A00.A05()) {
            NR nr = new NR(this.A01);
            nr.setData(c2h.A04(), null);
            nr.setOnClickListener(new ViewOnClickListenerC0799Ne(this, nr, c2h));
            c0806Nl.addView(nr);
        }
        return c0806Nl;
    }
}
