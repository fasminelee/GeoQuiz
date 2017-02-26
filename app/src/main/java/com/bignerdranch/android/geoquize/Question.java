package com.bignerdranch.android.geoquize;

/**
 * Created by Lane on 2017/2/26.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTure;

    public Question (int textResId, boolean answerTure) {
        mTextResId = textResId;
        mAnswerTure = answerTure;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTure() {
        return mAnswerTure;
    }

    public void setAnswerTure(boolean answerTure) {
        mAnswerTure = answerTure;
    }


}
