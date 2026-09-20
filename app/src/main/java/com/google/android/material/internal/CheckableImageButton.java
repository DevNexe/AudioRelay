package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.ApLL;
import defpackage.CQf;
import defpackage.bi5;
import defpackage.bq;

/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends ApLL implements Checkable {
    public static final int[] C = {R.attr.state_checked};
    public boolean A;
    public boolean B;
    public boolean z;

    public static class QnHx extends CQf {
        public static final Parcelable.Creator<QnHx> CREATOR = new C0082QnHx();
        public boolean y;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$QnHx$QnHx, reason: collision with other inner class name */
        public static class C0082QnHx implements Parcelable.ClassLoaderCreator<QnHx> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final QnHx createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new QnHx(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QnHx[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new QnHx(parcel, null);
            }
        }

        public QnHx(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            parcel.writeInt(this.y ? 1 : 0);
        }

        public QnHx(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.y = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.azefsw.audioconnect.R.attr.imageButtonStyle);
        this.A = true;
        this.B = true;
        bi5.m(this, new bq(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.z;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.z ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), C) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof QnHx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        QnHx qnHx = (QnHx) parcelable;
        super.onRestoreInstanceState(qnHx.w);
        setChecked(qnHx.y);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        QnHx qnHx = new QnHx(super.onSaveInstanceState());
        qnHx.y = this.z;
        return qnHx;
    }

    public void setCheckable(boolean z) {
        if (this.A != z) {
            this.A = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.A || this.z == z) {
            return;
        }
        this.z = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.B = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.B) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.z);
    }
}
