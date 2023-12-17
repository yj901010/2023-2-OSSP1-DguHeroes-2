import { AxiosRequestConfig } from 'axios'
import { axiosGET } from './base'
import { ProjectDetailItemType } from 'types/project'
import { paramFilter } from 'constants/system/paramFilter'

export const baseURL = process.env.REACT_APP_API_URL

export type GetProjectDetailsRequestType = {
  projectKey: number
}

export type GetProjectDetailsResponseType = {
  ProjectDetailItemType: ProjectDetailItemType
  status: "SUCCESS" | "FAILED"
	message?: string
}

// const getQueryPath = (params: GetProjectDetailsRequestType) => `/project/details/${params.projectKey}`
const getQueryPath = (params: GetProjectDetailsRequestType) => {
  const paramsValue = JSON.stringify(params.projectKey).replaceAll(paramFilter, "")
  return `${baseURL}/project/details/${paramsValue}`
}

export const getProjectDetails = (params: GetProjectDetailsRequestType, config?: AxiosRequestConfig) => {
  return axiosGET<GetProjectDetailsRequestType, GetProjectDetailsResponseType>(
    getQueryPath(params),
    params,
    config
  )
}