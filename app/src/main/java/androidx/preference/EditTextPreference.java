package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.azefsw.audioconnect.R;
import defpackage.OW8;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    public static final class QnHx implements Preference.QnHx<EditTextPreference> {
        public static QnHx a;

        @Override // androidx.preference.Preference.QnHx
        public final CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            editTextPreference.getClass();
            if (TextUtils.isEmpty(null)) {
                return editTextPreference.w.getString(R.string.not_set);
            }
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iA = zb5.a(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iA);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OW8.z, iA, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (QnHx.a == null) {
                QnHx.a = new QnHx();
            }
            this.C = QnHx.a;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object d(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
