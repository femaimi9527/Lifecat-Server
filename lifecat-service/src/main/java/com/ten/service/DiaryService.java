package com.ten.service;

import java.util.List;

/**
 * Diary
 *
 * @date 2018/7/18
 * @auther ten
 */
public interface DiaryService {

    /**
     * 查询Diary List
     *
     * @param userId user_id
     */
    List<DiaryDO> readDiaryListByUserId(int userId);

    /**
     * 查询Diary
     *
     * @param diaryName diary_name
     */
    DiaryDO readDiaryByDiaryName(String diaryName);

    /**
     * 上传Diary
     *
     * @param diaryDO DO
     */
    int createDiary(DiaryDO diaryDO);

    /**
     * 更新Diary
     *
     * @param diaryDO diary
     */
    int updateDiary(DiaryDO diaryDO);

    /**
     * 删除Diary
     *
     * @param diaryId diary_id
     */
    int deleteDiaryById(int diaryId);
}
